/**
 * @Project: 特维内容管理系统
 * @Description: TODO(用一句话描述该文件做什么)
 * Copyright (c) 2014 北京特维网讯技术有限公司 版权所有
 *
 * @author miaoxiaochen
 * @date 2014-12-19 下午05:40:56
 * @version V1.0
 */
package cn.tvcms.shop.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @ClassName: OrderAccepter
 * @Description:  订单的收货人信息
 * @author miaoxiaochen
 * @date 2014-12-19 下午05:40:56
 * 
 */
@Entity
@Table(name="shop_orderaccepter")
public class OrderAccepter implements Serializable {

	/** 
	 * @Fields 11111serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */ 
	private static final long serialVersionUID = 1L;
	
	@Transient
	private  String classNotes="订单的收货人信息";//类的注释
	/**
	 * 主键
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int oaID;
	/**
	 * 订单ID
	 */
	private int ordID;
	/**
	 * 姓名
	 */
	private String  name;
	/**
	 * 街道地址
	 */
	private String address4;
	/**
	 * 3级地址
	 */
	private String address3;
	/**
	 * 2级地址
	 */
	private String address2;
	/**
	 * 1级地址
	 */
	private String address1;
	/**
	 * 移动电话
	 */
	private String phone;
	/**
	 * 固定电话
	 */
	private String telephone;
	/**
	 * 邮编
	 */
	private String postMark;
	/**
	 * 电子邮件
	 */
	private String email;
	/**
	 * @return the classNotes
	 */
	public String getClassNotes() {
		return classNotes;
	}
	/**
	 * @param classNotes 要设置的 classNotes
	 */
	public void setClassNotes(String classNotes) {
		this.classNotes = classNotes;
	}
	/**
	 * @return the oaID
	 */
	public int getOaID() {
		return oaID;
	}
	/**
	 * @param oaID 要设置的 oaID
	 */
	public void setOaID(int oaID) {
		this.oaID = oaID;
	}
	/**
	 * @return the ordID
	 */
	public int getOrdID() {
		return ordID;
	}
	/**
	 * @param ordID 要设置的 ordID
	 */
	public void setOrdID(int ordID) {
		this.ordID = ordID;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address4
	 */
	public String getAddress4() {
		return address4;
	}
	/**
	 * @param address4 要设置的 address4
	 */
	public void setAddress4(String address4) {
		this.address4 = address4;
	}
	/**
	 * @return the address3
	 */
	public String getAddress3() {
		return address3;
	}
	/**
	 * @param address3 要设置的 address3
	 */
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 要设置的 address2
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 要设置的 address1
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone 要设置的 phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone 要设置的 telephone
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the postMark
	 */
	public String getPostMark() {
		return postMark;
	}
	/**
	 * @param postMark 要设置的 postMark
	 */
	public void setPostMark(String postMark) {
		this.postMark = postMark;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email 要设置的 email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/* (非 Javadoc)
	 * <p>Title: toString</p>
	 * <p>Description: </p>
	 * @author miaoxiaochen
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderAccepter [address1=" + address1 + ", address2=" + address2
				+ ", address3=" + address3 + ", address4=" + address4
				+ ", classNotes=" + classNotes + ", email=" + email + ", name="
				+ name + ", oaID=" + oaID + ", ordID=" + ordID + ", phone="
				+ phone + ", postMark=" + postMark + ", telephone=" + telephone
				+ "]";
	}
	
	
	
	
	
}
