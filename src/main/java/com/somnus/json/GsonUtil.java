package com.somnus.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;

public class GsonUtil {
	private static Gson gson = new Gson();
	 /**
     * 将Json字符串转化成Java对象
	 * @param <T>
     * 
     * @param json Json字符串
     * @param clazz Java对象类型
     * @return Java对象
     */
    @SuppressWarnings("unchecked")
	public static  <T> T fromJson(String json, Class<T> clazz){
        T value = null;
        try {
        	if (Map.class.isAssignableFrom(clazz) 
        	        || List.class.isAssignableFrom(clazz)) {
        		Object obj = gson.fromJson(json, Object.class);
        		value = clazz.isInstance(obj) ? (T) obj : null;
        	} 
        	else {
                value = gson.fromJson(json, clazz);
        	}
        } 
        catch (Exception e) {
        	e.printStackTrace();
        }
        return value;
    }

    /**
     * 将Java对象转化成Json字符串
     * 
     * @param o Java对象
     * @return Json字符串
     */
    public static String toJson(Object o){
        return gson.toJson(o);
    }
    public static void main(String[] args) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("key1", "a");
		map.put("key2", 2);
		User user = new User();
		user.setUsername("admin");
		user.setPassword("123");
		map.put("key3",user);
		List<Integer> list4 = new ArrayList<Integer>();
		list4.add(1);
		list4.add(2);
		map.put("key4",list4);
		String jsonmap = GsonUtil.toJson(map);
		System.out.println(jsonmap);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		String jsonlist = GsonUtil.toJson(list);
		System.out.println(jsonlist);
		
		Map unmap = GsonUtil.fromJson("{\"key4\":[1,2],\"key3\":{\"username\":\"admin\",\"password\":\"123\"},\"key2\":2,\"key1\":\"a\"}", Map.class);
		Map key3 = ((Map)unmap.get("key3"));
		System.out.println(unmap.get("key1"));
		System.out.println(unmap.get("key2"));
		System.out.println(key3.get("username"));
		System.out.println(key3.get("password"));
		List<Integer> key4 = ((List<Integer>)unmap.get("key4"));
		for(Integer data:key4){
			System.out.println(data);
		}
		
		User unuser =  GsonUtil.fromJson("{\"username\":\"admin\",\"password\":\"123\"}",User.class);
		System.out.println(unuser.getUsername());
		System.out.println(unuser.getPassword());
	}
}