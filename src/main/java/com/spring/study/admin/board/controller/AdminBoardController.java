package com.spring.study.admin.board.controller;


import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.spring.study.admin.board.service.AdminBoardService;
import com.spring.study.board.model.vo.BoardVO;
import com.spring.study.board.model.vo.ReplyVO;


@Controller
@RequestMapping("/admin/board")
public class AdminBoardController {
	
	@Resource(name="AdminBoardService")
	private AdminBoardService service;
	
	
	@RequestMapping(value="/listPage")
	public String list_controller(Model model){
		System.out.println("admin list page controllers");
		List<BoardVO> list = service.admin_list();
		System.out.println("list : " + list.toString());
		model.addAttribute("list", list);
		return "";
	}
	
	@RequestMapping(value="register", method=RequestMethod.GET)
	public String registerForm() {
		System.out.println("registeFrom");
		return "board/register";
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String register(BoardVO board) {
		System.out.println("registe board");
		int flag = service.admin_insert(board);
		return "redirect:/board/listPage" ; 
	}
	
	@RequestMapping(value="/readPage" , method=RequestMethod.GET)
	public String read(BoardVO obj, Model model){
		System.out.println("Ctrl read post");
		BoardVO board = service.admin_read(obj);
		model.addAttribute("board", board);
		return "/board/readPage" ; 
	}
	
	@RequestMapping(value="/removePage" , method=RequestMethod.GET)
	public String remove(BoardVO obj){
		System.out.println("Ctrl remove post");
		int flag = service.admin_remove(obj);
		return "redirect:/board/listPage" ; 
	}
	@RequestMapping(value="/modifyPage" , method=RequestMethod.GET)
	public String modifyForm(BoardVO obj, Model model){
		System.out.println("Ctrl modifyForm get");
		BoardVO board = service.admin_read(obj);
		model.addAttribute("board", board);
		return "/board/modifyPage" ; 
	}
	
	@RequestMapping(value="/modifyPage" , method=RequestMethod.POST)
	public String modify(BoardVO obj){
		System.out.println("Ctrl modify post");
		int flag = service.admin_modify(obj);
		return "redirect:/board/listPage" ; 
	}
	
	@RequestMapping(value="/search" , method=RequestMethod.POST)
	@ResponseBody
	public List<BoardVO> search(String type , String keyword){
		System.out.println("Ctrl search post");
		System.out.println("param : "+type);
		System.out.println("param : "+keyword);
		List<BoardVO> list = service.admin_search(type, keyword);
		return list ; 
	}
	
	@RequestMapping(value="/replyInsert" , method=RequestMethod.POST)
	@ResponseBody
	public List<ReplyVO> rinsert(ReplyVO reply){
		System.out.println("Ctrl rinsert post");
		System.out.println("param : "+reply.getRwriter());
		System.out.println("param : "+reply.getRcontent());
		System.out.println("param : "+reply.getBno());
		
		List<ReplyVO> list = service.admin_rinsert(reply);
		
		return list ; 
	}
	
	@RequestMapping(value="/replyRemove" , method=RequestMethod.POST)
	@ResponseBody
	public List<ReplyVO> rremove(ReplyVO reply){
		System.out.println("Ctrl rremove post");
		System.out.println("param : "+reply.getRseq());
		
		List<ReplyVO> list = service.admin_rremove(reply);
		
		return list ; 
	}

}
