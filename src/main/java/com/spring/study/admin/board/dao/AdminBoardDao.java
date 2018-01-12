package com.spring.study.admin.board.dao;

import java.util.List;

import com.spring.study.board.model.vo.BoardVO;
import com.spring.study.board.model.vo.ReplyVO;

public interface AdminBoardDao {

	public List<BoardVO> admin_listRow();
	public int			 admin_insertRow(BoardVO obj);
	public BoardVO		 admin_readRow(BoardVO obj);
	public int			 admin_removeRow(BoardVO obj);
	public int			 admin_modifyRow(BoardVO obj);
	public List<BoardVO> admin_searchRow(String type , String keyword);
	public List<ReplyVO> admin_rinsertRow(ReplyVO reply);
	public List<ReplyVO> admin_rremoveRow(ReplyVO reply);
}
