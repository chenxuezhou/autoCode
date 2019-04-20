package com.qunar.web.service.Customers;

import org.durcframework.core.service.CrudService;
import com.qunar.web.dao.Customers.PostsDao;
import com.qunar.web.entity.Customers.Posts;
import org.springframework.stereotype.Service;

@Service
public class PostsService extends CrudService<Posts, PostsDao> {

}