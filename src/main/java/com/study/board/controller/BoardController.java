package com.study.board.controller;


import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.spring.study.board.model.vo.BoardVO;
import com.spring.study.board.model.vo.ReplyVO;
import com.spring.study.board.service.BoardService;


@Controller
@RequestMapping(value="/board")
public class BoardController {

	@Resource(name="BoardService")
	private BoardService service;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String cell() {
		return "redirect:/";
	}
	
	@RequestMapping(value="/listPage")
	public String list(Model model)
	{
		System.out.println("list page controllers");
		List<BoardVO> list = service.list();
		model.addAttribute("list", list);
		return "board/listPage";
	}
	
	@RequestMapping(value="register", method=RequestMethod.GET)
	public String registerForm() {
		System.out.println("registeFrom");
		return "board/register";
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String register(BoardVO board) {
		System.out.println("registe board");
		int flag = service.insert(board);
		return "redirect:/board/listPage" ; 
	}
	
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detail_list(Model model) {
		return "";
	}
	@RequestMapping(value="/detail", method=RequestMethod.POST)
	public String postdetail_list(Model model) {
		return "";
	}
	
	
	@RequestMapping(value="/readPage" , method=RequestMethod.GET)
	public String read(BoardVO obj, Model model){
		System.out.println("Ctrl read post");
		BoardVO board = service.read(obj);
		model.addAttribute("board", board);
		return "/board/readPage" ; 
	}
	
	@RequestMapping(value="/removePage" , method=RequestMethod.GET)
	public String remove(BoardVO obj){
		System.out.println("Ctrl remove post");
		int flag = service.remove(obj);
		return "redirect:/board/listPage" ; 
	}
	@RequestMapping(value="/modifyPage" , method=RequestMethod.GET)
	public String modifyForm(BoardVO obj, Model model){
		System.out.println("Ctrl modifyForm get");
		BoardVO board = service.read(obj);
		model.addAttribute("board", board);
		return "/board/modifyPage" ; 
	}
	
	@RequestMapping(value="/modifyPage" , method=RequestMethod.POST)
	public String modify(BoardVO obj){
		System.out.println("Ctrl modify post");
		int flag = service.modify(obj);
		return "redirect:/board/listPage" ; 
	}
	
	@RequestMapping(value="/search" , method=RequestMethod.POST)
	@ResponseBody
	public List<BoardVO> search(String type , String keyword){
		System.out.println("Ctrl search post");
		System.out.println("param : "+type);
		System.out.println("param : "+keyword);
		List<BoardVO> list = service.search(type, keyword);
		return list ; 
	}
	
	@RequestMapping(value="/replyInsert" , method=RequestMethod.POST)
	@ResponseBody
	public List<ReplyVO> rinsert(ReplyVO reply){
		System.out.println("Ctrl rinsert post");
		System.out.println("param : "+reply.getRwriter());
		System.out.println("param : "+reply.getRcontent());
		System.out.println("param : "+reply.getBno());
		
		List<ReplyVO> list = service.rinsert(reply);
		
		return list ; 
	}
	
	@RequestMapping(value="/replyRemove" , method=RequestMethod.POST)
	@ResponseBody
	public List<ReplyVO> rremove(ReplyVO reply){
		System.out.println("Ctrl rremove post");
		System.out.println("param : "+reply.getRseq());
		
		List<ReplyVO> list = service.rremove(reply);
		
		return list ; 
	}
}
