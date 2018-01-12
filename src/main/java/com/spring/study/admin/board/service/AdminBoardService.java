package com.spring.study.admin.board.service;

import java.util.List;

import com.spring.study.board.model.vo.BoardVO;
import com.spring.study.board.model.vo.ReplyVO;

public interface AdminBoardService {

	public List<BoardVO>    admin_list();
	public int				admin_insert(BoardVO obj);
	public BoardVO			admin_read(BoardVO obj);
	public int				admin_remove(BoardVO obj);
	public int				admin_modify(BoardVO obj);
	public List<BoardVO> 	admin_search(String type , String keyword);
	public List<ReplyVO> 	admin_rinsert(ReplyVO reply);
	public List<ReplyVO> 	admin_rremove(ReplyVO reply);
}
