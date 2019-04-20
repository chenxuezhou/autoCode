package com.qunar.web.entity.Customers;

import java.util.Date;

import org.durcframework.core.expression.annotation.ValueField;
import org.durcframework.core.support.SearchEasyUI;
import org.durcframework.core.util.DateUtil;


public class CommentlistSch extends SearchEasyUI{

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


    private Integer idSch;
    private String avatarSch;
    private String nameSch;
    private Double rateSch;
    private String commentSch;
    private String cus_idSch;
    private Integer like_idSch;
    private Integer order_idSch;

    public void setIdSch(Integer idSch){
        this.idSch = idSch;
    }
    
    @ValueField(column = "id")
    public Integer getIdSch(){
        return this.idSch;
    }

    public void setAvatarSch(String avatarSch){
        this.avatarSch = avatarSch;
    }
    
    @ValueField(column = "avatar")
    public String getAvatarSch(){
        return this.avatarSch;
    }

    public void setNameSch(String nameSch){
        this.nameSch = nameSch;
    }
    
    @ValueField(column = "name")
    public String getNameSch(){
        return this.nameSch;
    }

    public void setRateSch(Double rateSch){
        this.rateSch = rateSch;
    }
    
    @ValueField(column = "rate")
    public Double getRateSch(){
        return this.rateSch;
    }

    public void setCommentSch(String commentSch){
        this.commentSch = commentSch;
    }
    
    @ValueField(column = "comment")
    public String getCommentSch(){
        return this.commentSch;
    }

    public void setCusIdSch(String cus_idSch){
        this.cus_idSch = cus_idSch;
    }
    
    @ValueField(column = "cus_id")
    public String getCusIdSch(){
        return this.cus_idSch;
    }

    public void setLikeIdSch(Integer like_idSch){
        this.like_idSch = like_idSch;
    }
    
    @ValueField(column = "like_id")
    public Integer getLikeIdSch(){
        return this.like_idSch;
    }

    public void setOrderIdSch(Integer order_idSch){
        this.order_idSch = order_idSch;
    }
    
    @ValueField(column = "order_id")
    public Integer getOrderIdSch(){
        return this.order_idSch;
    }


}