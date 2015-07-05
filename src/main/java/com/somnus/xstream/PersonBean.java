package com.somnus.xstream;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/** 
 * @Title: PersonBean.java 
 * @Package com.somnus.xstream 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月30日 下午5:43:26 
 * @version V1.0 
 */
@XStreamAlias("person")
public class PersonBean {
    @XStreamAlias("firstName")
    private String firstName;
    @XStreamAlias("lastName")
    private String lastName;
     
    @XStreamAlias("telphone")
    private PhoneNumber tel;
    @XStreamAlias("faxphone")
    private PhoneNumber fax;
     
    //测试一个标签下有多个同名标签
    @XStreamAlias("friends")
    private Friends friend;
     
    //测试一个标签下循环对象
    @XStreamAlias("pets")
    private Pets pet;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PhoneNumber getTel() {
        return tel;
    }

    public void setTel(PhoneNumber tel) {
        this.tel = tel;
    }

    public PhoneNumber getFax() {
        return fax;
    }

    public void setFax(PhoneNumber fax) {
        this.fax = fax;
    }

    public Friends getFriend() {
        return friend;
    }

    public void setFriend(Friends friend) {
        this.friend = friend;
    }

    public Pets getPet() {
        return pet;
    }

    public void setPet(Pets pet) {
        this.pet = pet;
    }
    /**
     * 用Xstream注解的方式实现：一个标签下有多个同名标签 
     *@ClassName:Friends
     */
    public static class Friends{
        @XStreamImplicit(itemFieldName="name")   //itemFieldName定义重复字段的名称，
        /*<friends>                               <friends>
            <name>A1</name>                         <String>A1</String>
            <name>A2</name>    如果没有，则会变成    =====>   <String>A1</String>
            <name>A3</name>                         <String>A1</String>
        </friends>                                </friends>
        */
        private List<String> name;
 
        public List<String> getName() {
            return name;
        }
 
        public void setName(List<String> name) {
            this.name = name;
        }
    }
}
