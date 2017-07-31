package com.myfirstssh.book.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.myfirstssh.book.dao.BookDao;
import com.myfirstssh.book.model.Book;
import com.myfirstssh.book.service.BookService;
import com.myfirstssh.common.dao.BaseDao;
import com.myfirstssh.common.dao.impl.BaseDaoImpl;

public class BookServiceImpl extends BaseDaoImpl<Book> implements BookService {
	
	@Autowired
	BookDao bookDao;
	@Override
	public BaseDao getDao() {
		// TODO Auto-generated method stub
		return bookDao;
	}

	

}
