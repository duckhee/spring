package com.spring.study.board.model.vo;

/*
CREATE TABLE TBL_REPLY(
		RSEQ       NUMBER PRIMARY KEY,
		BNO        NUMBER REFERENCES TBL_BOARD(BNO) , 
		RWRITER    VARCHAR2(20) , 
		RCONTENT   VARCHAR2(1000)
);

CREATE SEQUENCE REPLYSEQ ; 

CREATE TABLE `tbl_reply` (
	`RSEQ` INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`BNO` INT(11) NULL DEFAULT NULL,
	`RWRITER` VARCHAR(20) NULL DEFAULT NULL,
	`RCONTENT` TEXT NULL,
	`create_time` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
	`update_time` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`RSEQ`)
)

);

*/

public class ReplyVO {
	private int 	rseq , bno ; 
	private String	rwriter , rcontent ;
	public ReplyVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReplyVO(int rseq, int bno, String rwriter, String rcontent) {
		super();
		this.rseq = rseq;
		this.bno = bno;
		this.rwriter = rwriter;
		this.rcontent = rcontent;
	}
	public int getRseq() {
		return rseq;
	}
	public void setRseq(int rseq) {
		this.rseq = rseq;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getRwriter() {
		return rwriter;
	}
	public void setRwriter(String rwriter) {
		this.rwriter = rwriter;
	}
	public String getRcontent() {
		return rcontent;
	}
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}
	
	@Override
	public String toString() {
		return "ReplyVO [rseq=" + rseq + ", bno=" + bno + ", rwriter=" + rwriter + ", rcontent=" + rcontent + "]";
	} 

}
