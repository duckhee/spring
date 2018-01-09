package com.spring.study.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.study.board.model.vo.BoardVO;
import com.spring.study.board.model.vo.ReplyVO;

@Repository("boardDao")
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSession session;
	
	
	@Override
	public List<BoardVO> listRow() {
		// TODO Auto-generated method stub
		System.out.println("Dao listRow");
		return session.selectList("com.spring.study.mapper.board.list");
	}

	@Override
	public int insertRow(BoardVO obj) {
		// TODO Auto-generated method stub
		System.out.println("Dao insertRow");
		return 0;
	}

	@Override
	public BoardVO readRow(BoardVO obj) {
		// TODO Auto-generated method stub
		System.out.println("Dao readRow");
		return null;
	}

	@Override
	public int removeRow(BoardVO obj) {
		// TODO Auto-generated method stub
		System.out.println("Dao removeRow");
		return 0;
	}

	@Override
	public int modifyRow(BoardVO obj) {
		// TODO Auto-generated method stub
		System.out.println("Dao modifyRow");
		return 0;
	}

	@Override
	public List<BoardVO> searchRow(String type, String keyword) {
		// TODO Auto-generated method stub
		System.out.println("Dao searchRow");
		return null;
	}

	@Override
	public List<ReplyVO> rInsertRow(ReplyVO reply) {
		// TODO Auto-generated method stub
		System.out.println("Dao rInsertRow");
		return null;
	}

	@Override
	public List<ReplyVO> rRemoveRow(ReplyVO reply) {
		// TODO Auto-generated method stub
		System.out.println("Dao rRemoveRow");
		return null;
	}

}
