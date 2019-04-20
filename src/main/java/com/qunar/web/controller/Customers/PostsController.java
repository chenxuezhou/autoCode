package com.qunar.web.controller.Customers;

import org.durcframework.core.GridResult;
import org.durcframework.core.MessageResult;
import org.durcframework.core.controller.CrudController;
import com.qunar.web.entity.Customers.Posts;
import com.qunar.web.entity.Customers.PostsSch;
import com.qunar.web.service.Customers.PostsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostsController extends
		CrudController<Posts, PostsService> {

		//新增记录
	@RequestMapping("/addPosts.do")
	public @ResponseBody
	MessageResult addPosts(Posts entity) {
		return this.save(entity);
	}

	//删除记录
	@RequestMapping("/delPosts.do")
	public @ResponseBody
	MessageResult delPosts(Posts entity) {
		return this.delete(entity);
	}
	
	//修改记录
	@RequestMapping("/updatePosts.do")
	public @ResponseBody
	MessageResult updatePosts(Posts entity) {
		return this.update(entity);
	}

	//条件查询分页操作
	@RequestMapping("/listPosts.do")
	public @ResponseBody
	GridResult listPosts(PostsSch searchEntitySch) {
		return this.query(searchEntitySch);
	}

	
	//条件查询并返回所有记录
	@RequestMapping("/listAllPosts.do")
    public @ResponseBody Object listAllPosts(PostsSch searchEntitySch) {
        return this.queryAll(searchEntitySch);
    }

    //获取详细信息
	@RequestMapping("/getPostsById.do")
    public @ResponseBody Posts getPostsById(Posts entity) {
        return this.getService().get(entity.getId());
    }

 	

}