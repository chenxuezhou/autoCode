package com.qunar.web.entity.Customers;

import java.util.Date;

import org.durcframework.core.expression.annotation.ValueField;
import org.durcframework.core.support.SearchEasyUI;
import org.durcframework.core.util.DateUtil;


public class PostsSch extends SearchEasyUI{

	//根据时间进行搜索的部分
	private Date createdStartSch;
	private Date createdEndSch;

	@ValueField(column = "createdTime", equal = ">=")
	public Date getCreatedStartSch() {
		return createdStartSch;
	}

	public void setCreatedStartSch(Date createdStartSch) {
		this.createdStartSch = createdStartSch;
	}

	@ValueField(column = "createdTime", equal = "<")
	public Date getCreatedEndSch() {
		if (createdEndSch != null) {
			return DateUtil.getDateAfterDay(createdEndSch, 1);
		}
		return createdEndSch;
	}

	public void setCreatedEndSch(Date createdEndSch) {
		this.createdEndSch = createdEndSch;
	}


    private String uidSch;
    private String titleSch;
    private String contentSch;
    private Integer idSch;
    private Date timeSch;

    public void setUidSch(String uidSch){
        this.uidSch = uidSch;
    }
    
    @ValueField(column = "uid")
    public String getUidSch(){
        return this.uidSch;
    }

    public void setTitleSch(String titleSch){
        this.titleSch = titleSch;
    }
    
    @ValueField(column = "title")
    public String getTitleSch(){
        return this.titleSch;
    }

    public void setContentSch(String contentSch){
        this.contentSch = contentSch;
    }
    
    @ValueField(column = "content")
    public String getContentSch(){
        return this.contentSch;
    }

    public void setIdSch(Integer idSch){
        this.idSch = idSch;
    }
    
    @ValueField(column = "id")
    public Integer getIdSch(){
        return this.idSch;
    }

    public void setTimeSch(Date timeSch){
        this.timeSch = timeSch;
    }
    
    @ValueField(column = "time")
    public Date getTimeSch(){
        return this.timeSch;
    }


}