package com.qunar.web.entity.Customers;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Posts {
	private String uid;
	private String title;
	private String content;
	private Integer id;
	@JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
	private Date time;

	public void setUid(String uid){
		this.uid = uid;
	}

	public String getUid(){
		return this.uid;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return this.title;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return this.content;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setTime(Date time){
		this.time = time;
	}

	public Date getTime(){
		return this.time;
	}

}