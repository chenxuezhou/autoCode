package com.qunar.web.controller.Customers;

import org.durcframework.core.GridResult;
import org.durcframework.core.MessageResult;
import org.durcframework.core.controller.CrudController;
import com.qunar.web.entity.Customers.Commentlist;
import com.qunar.web.entity.Customers.CommentlistSch;
import com.qunar.web.service.Customers.CommentlistService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommentlistController extends
		CrudController<Commentlist, CommentlistService> {

		//新增记录
	@RequestMapping("/addCommentlist.do")
	public @ResponseBody
	MessageResult addCommentlist(Commentlist entity) {
		return this.save(entity);
	}

	//删除记录
	@RequestMapping("/delCommentlist.do")
	public @ResponseBody
	MessageResult delCommentlist(Commentlist entity) {
		return this.delete(entity);
	}
	
	//修改记录
	@RequestMapping("/updateCommentlist.do")
	public @ResponseBody
	MessageResult updateCommentlist(Commentlist entity) {
		return this.update(entity);
	}

	//条件查询分页操作
	@RequestMapping("/listCommentlist.do")
	public @ResponseBody
	GridResult listCommentlist(CommentlistSch searchEntitySch) {
		return this.query(searchEntitySch);
	}

	
	//条件查询并返回所有记录
	@RequestMapping("/listAllCommentlist.do")
    public @ResponseBody Object listAllCommentlist(CommentlistSch searchEntitySch) {
        return this.queryAll(searchEntitySch);
    }

    //获取详细信息
	@RequestMapping("/getCommentlistById.do")
    public @ResponseBody Commentlist getCommentlistById(Commentlist entity) {
        return this.getService().get(entity.getId());
    }

 	

}