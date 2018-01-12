package com.spring.study.admin.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.study.board.model.vo.BoardVO;
import com.spring.study.board.model.vo.ReplyVO;

@Repository("AdminBoardDao")
public class AdminBoardDaoImpl implements AdminBoardDao {

	@Autowired
	private SqlSession session;
	
	
	@Override
	public List<BoardVO> admin_listRow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int admin_insertRow(BoardVO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardVO admin_readRow(BoardVO obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int admin_removeRow(BoardVO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int admin_modifyRow(BoardVO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardVO> admin_searchRow(String type, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReplyVO> admin_rinsertRow(ReplyVO reply) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReplyVO> admin_rremoveRow(ReplyVO reply) {
		// TODO Auto-generated method stub
		return null;
	}

}
