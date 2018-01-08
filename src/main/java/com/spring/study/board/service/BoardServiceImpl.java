package com.spring.study.board.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.spring.study.board.dao.BoardDao;
import com.spring.study.board.model.vo.BoardVO;
import com.spring.study.board.model.vo.ReplyVO;


@Service("BoardService")
public class BoardServiceImpl implements BoardService {

	@Resource(name="boardDao")
	private BoardDao dao;
	
	@Override
	public List<BoardVO> list() {
		// TODO Auto-generated method stub
		System.out.println("service list");
		return dao.listRow();
	}

	@Override
	public int insert(BoardVO obj) {
		// TODO Auto-generated method stub
		System.out.println("service insert");
		return dao.insertRow(obj);
	}

	@Override
	public BoardVO read(BoardVO obj) {
		// TODO Auto-generated method stub
		System.out.println("service read");
		return dao.readRow(obj);
	}

	@Override
	public int remove(BoardVO obj) {
		// TODO Auto-generated method stub
		System.out.println("service remove");
		return dao.removeRow(obj);
	}

	@Override
	public int modify(BoardVO obj) {
		// TODO Auto-generated method stub
		System.out.println("service modify");
		return dao.modifyRow(obj);
	}

	@Override
	public List<BoardVO> search(String type, String keyword) {
		// TODO Auto-generated method stub
		System.out.println("service search");
		return dao.searchRow(type, keyword);
	}

	@Override
	public List<ReplyVO> rinsert(ReplyVO reply) {
		// TODO Auto-generated method stub
		System.out.println("service rinsert");
		return dao.rInsertRow(reply);
	}

	@Override
	public List<ReplyVO> rremove(ReplyVO reply) {
		// TODO Auto-generated method stub
		System.out.println("service rremove");
		return dao.rRemoveRow(reply);
	}

}
