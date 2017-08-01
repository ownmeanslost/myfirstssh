package com.myfirstssh.book.dao;

import java.util.List;

import com.myfirstssh.book.model.Book;
import com.myfirstssh.book.vo.BookVO;
import com.myfirstssh.common.dao.BaseDao;
import com.myfirstssh.common.pagination.PaginationResponse;
import com.myfirstssh.common.pagination.QueryCondition;


public interface BookDao extends BaseDao<Book> {
	public PaginationResponse<BookVO> getBookList(List<QueryCondition> cons, int pageIndex, int pageSize);
}
