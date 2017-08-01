package com.myfirstssh.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myfirstssh.book.dao.BookDao;
import com.myfirstssh.book.model.Book;
import com.myfirstssh.book.service.BookService;
import com.myfirstssh.book.vo.BookVO;
import com.myfirstssh.common.dao.BaseDao;
import com.myfirstssh.common.dao.impl.BaseDaoImpl;
import com.myfirstssh.common.pagination.PaginationResponse;
import com.myfirstssh.common.pagination.QueryCondition;

public class BookServiceImpl extends BaseDaoImpl<Book>implements BookService {

	@Autowired
	BookDao bookDao;

	@Override
	public BaseDao getDao() {
		// TODO Auto-generated method stub
		return bookDao;
	}

	@Override
	public PaginationResponse<BookVO> getBookList(List<QueryCondition> cons, int pageIndex, int pageSize) {

		return bookDao.getBookList(cons, pageIndex, pageSize);
	}

}
