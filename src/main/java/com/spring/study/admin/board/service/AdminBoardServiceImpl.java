package com.spring.study.admin.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.study.admin.board.dao.AdminBoardDao;
import com.spring.study.board.model.vo.BoardVO;
import com.spring.study.board.model.vo.ReplyVO;

@Service("AdminBoardService")
public class AdminBoardServiceImpl implements AdminBoardService {

	@Resource(name="AdminBoardDao")
	private AdminBoardDao dao;
	
	@Override
	public List<BoardVO> admin_list() {
		// TODO Auto-generated method stub
		return dao.admin_listRow();
	}

	@Override
	public int admin_insert(BoardVO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardVO admin_read(BoardVO obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int admin_remove(BoardVO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int admin_modify(BoardVO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardVO> admin_search(String type, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReplyVO> admin_rinsert(ReplyVO reply) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReplyVO> admin_rremove(ReplyVO reply) {
		// TODO Auto-generated method stub
		return null;
	}

}
