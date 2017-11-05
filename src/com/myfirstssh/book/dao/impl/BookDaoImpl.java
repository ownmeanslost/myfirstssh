package com.myfirstssh.book.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.myfirstssh.book.dao.BookDao;
import com.myfirstssh.book.model.Book;
import com.myfirstssh.book.vo.BookVO;
import com.myfirstssh.common.dao.impl.BaseDaoImpl;
import com.myfirstssh.common.pagination.PaginationResponse;
import com.myfirstssh.common.pagination.QueryCondition;

public class BookDaoImpl extends BaseDaoImpl<Book>implements BookDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public PaginationResponse<BookVO> getBookList(List<QueryCondition> cons, int pageIndex, int pageSize) {
		PaginationResponse<BookVO> result = new PaginationResponse<BookVO>();
		String strSql = "select * from  " + getTableName();
		String countSql = "select count(*) from " + getTableName();

		int beginIndex = (pageIndex) * pageSize;
		int endIndex=beginIndex+pageSize;
		strSql += " limit " + beginIndex + ", " + endIndex;
		List<Map<String, Object>> list = jdbcTemplate.queryForList(strSql);

		int total = jdbcTemplate.queryForInt(countSql);
		result.setTotal(total);
		List<BookVO> vos = new ArrayList<BookVO>();
		for (Map<String, Object> map : list) {
			BookVO vo = new BookVO();
			vo.setId(getMapValue("id", map));
			vo.setName(getMapValue("name", map));
			vos.add(vo);
		}

		result.setRows(vos);

		return result;
	}

	private String getMapValue(String key, Map<String, Object> map) {
		Object obj = map.get(key);
		if (obj == null) { 	
			return null;
		}
		return obj.toString();
	}

}
