package com.qunar.web.entity.Customers;

import java.util.Date;

public class Commentlist {
	private Integer id;
	private String avatar;
	private String name;
	private Double rate;
	private String comment;
	private String cus_id;
	private Integer like_id;
	private Integer order_id;

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

	public String getAvatar(){
		return this.avatar;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setRate(Double rate){
		this.rate = rate;
	}

	public Double getRate(){
		return this.rate;
	}

	public void setComment(String comment){
		this.comment = comment;
	}

	public String getComment(){
		return this.comment;
	}

	public void setCusId(String cus_id){
		this.cus_id = cus_id;
	}

	public String getCusId(){
		return this.cus_id;
	}

	public void setLikeId(Integer like_id){
		this.like_id = like_id;
	}

	public Integer getLikeId(){
		return this.like_id;
	}

	public void setOrderId(Integer order_id){
		this.order_id = order_id;
	}

	public Integer getOrderId(){
		return this.order_id;
	}

}