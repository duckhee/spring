package com.spring.study.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		return session.selectList("list");
	}

	@Override
	public int insertRow(BoardVO obj) {
		// TODO Auto-generated method stub
		System.out.println("Dao insertRow");
		return session.insert("insert", obj);
	}
	
	private void upCnt(BoardVO obj) {
		System.out.println("Dao upCnt");
		session.update("com.spring.acorn.mapper.board.upcnt", obj);
		/*
		 * UPDATE TBL_BOARD 
		 * SET VIEWCNT = VIEWCNT + 1
		 * WHERE BNO = #{bno}
		 */
	}

	@Override
	public BoardVO readRow(BoardVO obj) {
		// TODO Auto-generated method stub
		System.out.println("Dao readRow");
		upCnt(obj);
		System.out.println("Dao param : "+obj.getBno());
		BoardVO board = session.selectOne("com.spring.acorn.mapper.board.read", obj);
		List<ReplyVO> rlist = session.selectList("read", obj);
		board.setRlist(rlist);
		return board ; 
	}

	@Override
	public int removeRow(BoardVO obj) {
		// TODO Auto-generated method stub
		System.out.println("Dao removeRow");
		System.out.println("Dao param : "+obj.getBno());
		return session.delete("remove", obj);
		
	}

	@Override
	public int modifyRow(BoardVO obj) {
		// TODO Auto-generated method stub
		System.out.println("Dao modifyRow");
		return session.update("modify", obj);
	}

	@Override
	public List<BoardVO> searchRow(String type, String keyword) {
		// TODO Auto-generated method stub
		System.out.println("Dao searchRow");
		Map<String, String> map = new HashMap<String, String>();
		map.put("type", type);	map.put("keyword", keyword);
		return session.selectList("search", map);
	}

	@Override
	public List<ReplyVO> rInsertRow(ReplyVO reply) {
		// TODO Auto-generated method stub
		System.out.println("Dao rInsertRow");
		int flag = session.insert("rInsert" , reply); 
		List<ReplyVO> rlist = null ; 
		if(flag!=0) {
			rlist = session.selectList("readReply", reply);
		}
		return rlist ;
	}

	@Override
	public List<ReplyVO> rRemoveRow(ReplyVO reply) {
		// TODO Auto-generated method stub
		System.out.println("Dao rRemoveRow");

		int flag = session.delete("rRemove" , reply); 
		List<ReplyVO> rlist = null ; 
		if(flag!=0) {
			rlist = session.selectList("readReply", reply);
		}
		return rlist ;
	}

}
