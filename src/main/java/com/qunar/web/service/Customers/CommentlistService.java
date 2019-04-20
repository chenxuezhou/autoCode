package com.qunar.web.service.Customers;

import org.durcframework.core.service.CrudService;
import com.qunar.web.dao.Customers.CommentlistDao;
import com.qunar.web.entity.Customers.Commentlist;
import org.springframework.stereotype.Service;

@Service
public class CommentlistService extends CrudService<Commentlist, CommentlistDao> {

}