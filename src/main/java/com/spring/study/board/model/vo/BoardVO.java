package com.spring.study.board.model.vo;

import java.util.Date;
import java.util.List;
import com.spring.study.board.model.vo.ReplyVO;

/*
CREATE TABLE tbl_board(
		bno		NUMBER PRIMARY KEY,
		title	VARCHAR2(50),
		content	VARCHAR2(2000),
		writer	VARCHAR2(50),
		regdate	date default sysdate,
		viewcnt	NUMBER DEFAULT 0

);
CREATE SEQUENCE BOARDSEQ ; 
INSERT INTO TBL_BOARD VALUES(BOARDSEQ.NEXTVAL, '잘됨','뻥이야','임정섭',DEFAULT, DEFAULT); 
COMMIT ; 

mysql
CREATE TABLE tbl_board(
		bno		int PRIMARY KEY autoincreament,
		title	VARCHAR(50),
		content	text(2000),
		writer	varchar(50),
		regdate	DATETIME DEFAULT CURRENT_TIMESTAMP,
		viewcnt	int DEFAULT 0

);


*/
public class BoardVO {

	private int 	bno ; 
	private String	title , content , writer ; 
	private Date	regdate ; 
	private int		viewcnt ;
	
	private List<ReplyVO> rlist ;

	public BoardVO() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public BoardVO(int bno, String title, String content, String writer, Date regdate, int viewcnt,
			List<ReplyVO> rlist) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		this.viewcnt = viewcnt;
		this.rlist = rlist;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getViewcnt() {
		return viewcnt;
	}

	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}

	public List<ReplyVO> getRlist() {
		return rlist;
	}

	public void setRlist(List<ReplyVO> rlist) {
		this.rlist = rlist;
	}


	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + ", viewcnt=" + viewcnt + ", rlist=" + rlist + "]";
	} 
	
	
}
