package com.myfirstssh.book.service;

import java.util.List;

import com.myfirstssh.book.model.Book;
import com.myfirstssh.book.vo.BookVO;
import com.myfirstssh.common.pagination.PaginationResponse;
import com.myfirstssh.common.pagination.QueryCondition;
import com.myfirstssh.common.service.BaseDaoService;

public interface BookService extends BaseDaoService<Book>{
	public PaginationResponse<BookVO> getBookList(List<QueryCondition> cons, int pageIndex, int pageSize);
		
	
}
