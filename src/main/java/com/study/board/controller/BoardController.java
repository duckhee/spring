package com.study.board.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.study.board.model.vo.BoardVO;
import com.spring.study.board.service.BoardService;

@Controller
@RequestMapping(value="board")
public class BoardController {

	@Resource(name="BoardService")
	private BoardService service;
	
	@RequestMapping("/listPage")
	public String list(Model model)
	{
		System.out.println("list page controllers");
		List<BoardVO> list = service.list();
		model.addAttribute("list", list);
		return "board/listPage";
	}
}
