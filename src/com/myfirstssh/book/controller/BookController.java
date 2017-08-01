package com.myfirstssh.book.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myfirstssh.book.service.BookService;
import com.myfirstssh.book.vo.BookVO;
import com.myfirstssh.common.pagination.PaginationResponse;
import com.myfirstssh.common.pagination.QueryCondition;

@Controller
@RequestMapping("/BookController")
public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping(value = "/BookList")
	public @ResponseBody PaginationResponse<BookVO> BookList(HttpServletRequest request) {
		String indexStr = request.getParameter("offset");
		String sizeStr = request.getParameter("limit");
		List<QueryCondition> cons = new ArrayList<QueryCondition>();
		int pageIndex = Integer.parseInt(indexStr);
		int pageSize = Integer.parseInt(sizeStr);
		return bookService.getBookList(cons, pageIndex, pageSize);

	}

}
