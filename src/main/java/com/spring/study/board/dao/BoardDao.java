package com.spring.study.board.dao;

import java.util.List;

import com.spring.study.board.model.vo.ReplyVO;
import com.spring.study.board.model.vo.BoardVO;

public interface BoardDao {

	public List<BoardVO> listRow();
	public int insertRow(BoardVO obj);
	public BoardVO			readRow(BoardVO obj);
	public int				removeRow(BoardVO obj);
	public int				modifyRow(BoardVO obj);
	public List<BoardVO> 	searchRow(String type, String keyword);
	public List<ReplyVO> 	rInsertRow(ReplyVO reply);
	public List<ReplyVO> 	rRemoveRow(ReplyVO reply);
}
