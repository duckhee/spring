package com.spring.study.board.service;

import java.util.List;

import com.spring.study.board.model.vo.ReplyVO;
import com.spring.study.board.model.vo.BoardVO;

public interface BoardService {
	
	public List<BoardVO> list();
	public int				insert(BoardVO obj);
	public BoardVO			read(BoardVO obj);
	public int				remove(BoardVO obj);
	public int				modify(BoardVO obj);
	public List<BoardVO> 	search(String type , String keyword);
	public List<ReplyVO> 	rinsert(ReplyVO reply);
	public List<ReplyVO> 	rremove(ReplyVO reply);
}
