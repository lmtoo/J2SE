package com.somnus.poi;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

public class ExportExcelUtil<T>{

	/**
	 * 这是一个通用的方法，利用了JAVA的反射机制，可以将放置在JAVA集合中并且符号一定条件的数据以EXCEL 的形式输出到指定IO设备上
	 * @param title
	 *            表格标题名
	 * @param headers
	 *            表格属性列名数组
	 * @param dataset
	 *            需要显示的数据集合,集合中一定要放置符合javabean风格的类的对象。此方法支持的
	 *            javabean属性的数据类型有基本数据类型及String,Date,byte[](图片数据)
	 * @param out
	 *            与输出设备关联的流对象，可以将EXCEL文档导出到本地文件或者网络中
	 * @param pattern
	 *            如果有时间数据，设定输出格式。默认为"yyy-MM-dd"
	 */

	@SuppressWarnings("unchecked")
	public byte[] exportExcel(String title, String[] headers,Collection<T> dataset, String pattern){
		// 声明一个工作薄
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFFont font3 = workbook.createFont();
		// 生成一个表格
		// 生成一个样式
		HSSFCellStyle style = workbook.createCellStyle();
		// 设置这些样式
		style.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		// 生成一个字体
		HSSFFont font = workbook.createFont();
		font.setColor(HSSFColor.VIOLET.index);
		font.setFontHeightInPoints((short) 12);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		// 把字体应用到当前的样式
		style.setFont(font);
		// 生成并设置另一个样式
		HSSFCellStyle style2 = workbook.createCellStyle();
		style2.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);
		style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		// 生成另一个字体
		HSSFFont font2 = workbook.createFont();
		font2.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);
		// 把字体应用到当前的样式
		style2.setFont(font2);
		HSSFSheet sheet = null;
		HSSFRow row = null;
		int index = 0;
		int sheetnum = 0;
		Iterator<T> it = dataset.iterator();
		// 产生表格标题行
		sheet = workbook.createSheet(title + sheetnum);
		sheet.setDefaultColumnWidth((short) 15);
		row = sheet.createRow(0);
		for (short i = 0; i < headers.length; i++){
			HSSFCell cell = row.createCell(i);
			cell.setCellStyle(style);
			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
			cell.setCellValue(text);
		}
		while (it.hasNext()){
			index++;
			if (index > 50000){
				index = 0;
				++sheetnum;
				sheet = workbook.createSheet(title + sheetnum);
				sheet.setDefaultColumnWidth((short) 15);
				row = sheet.createRow(0);
				for (short i = 0; i < headers.length; i++){
					HSSFCell cell = row.createCell(i);
					cell.setCellStyle(style);
					HSSFRichTextString text = new HSSFRichTextString(headers[i]);
					cell.setCellValue(text);
				}
			}
			row = sheet.createRow(index);
			T t = (T) it.next();
			// 利用反射，根据javabean属性的先后顺序，动态调用getXxx()方法得到属性值
			Field[] fields = t.getClass().getDeclaredFields();
			for (short i = 0; i < fields.length; i++){
				HSSFCell cell = row.createCell(i);
				cell.setCellStyle(style2);
				Field field = fields[i];
				String fieldName = field.getName();
				String getMethodName = "get"+ fieldName.substring(0, 1).toUpperCase()+ fieldName.substring(1);
				try{
					Class tCls = t.getClass();
					Method getMethod = tCls.getMethod(getMethodName,new Class[] {});
					Object value = getMethod.invoke(t, new Object[] {});
					// 判断值的类型后进行强制类型转换
					String textValue = null;
					if (value instanceof Integer){
						int intValue = (Integer) value;
						cell.setCellValue(intValue);
					}
					else if (value instanceof Float){
						float fValue = (Float) value;
						textValue = new HSSFRichTextString(String.valueOf(fValue)).toString();
						cell.setCellValue(textValue);
					}
					else if (value instanceof Double){
						double dValue = (Double) value;
						textValue = new HSSFRichTextString(String.valueOf(dValue)).toString();
						cell.setCellValue(textValue);
					}
					else if (value instanceof Long){
						long longValue = (Long) value;
						cell.setCellValue(longValue);
					}
					if (value instanceof Boolean){
						boolean bValue = (Boolean) value;
						textValue = "true";
						if (!bValue){
							textValue = "false";
						}
					}
					else if (value instanceof Date){
						Date date = (Date) value;
						if ("".equals(pattern)){
							pattern = "yyy-MM-dd";
						}
						SimpleDateFormat sdf = new SimpleDateFormat(pattern);
						textValue = sdf.format(date);
					}
					else{
						if (null == value || "".equals(value)){
							value = "";
						}
						else{
							textValue = value.toString();
						}
					}
					// 如果不是图片数据，就利用正则表达式判断textValue是否全部由数字组成
					if (textValue != null){
						Pattern p = Pattern.compile("^//d+(//.//d+)?$");
						Matcher matcher = p.matcher(textValue);
						if (matcher.matches()){
							// 是数字当作double处理
							cell.setCellValue(Double.parseDouble(textValue));
						}
						else{
							HSSFRichTextString richString = new HSSFRichTextString(textValue);
							font3.setColor(HSSFColor.BLUE.index);
							richString.applyFont(font3);
							cell.setCellValue(richString);
						}
					}
				}
				catch (Exception e){
					e.printStackTrace();
				}
			}
		}
		//*****************测试用******************************************
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try{
			// OutputStream out2 = new FileOutputStream("E://b.xls");
			// workbook.write(out2);
			workbook.write(baos);
			baos.flush();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		//*****************测试用******************************************
		return baos.toByteArray();
	}
}
