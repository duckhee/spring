package com.spring.study.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.study.board.model.vo.BoardVO;
import com.spring.study.board.model.vo.ReplyVO;

@Service("BoardService")
public class BoardServiceImpl implements BoardService {

	@Override
	public List<BoardVO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BoardVO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardVO read(BoardVO obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int remove(BoardVO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modify(BoardVO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardVO> search(String type, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReplyVO> rinsert(ReplyVO reply) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReplyVO> rremove(ReplyVO reply) {
		// TODO Auto-generated method stub
		return null;
	}

}
