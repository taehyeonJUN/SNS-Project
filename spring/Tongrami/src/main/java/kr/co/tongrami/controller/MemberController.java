package kr.co.tongrami.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.tongrami.model.Member;
import kr.co.tongrami.service.MemberService;

@Controller
public class MemberController{
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/login")
	String login(Member member) {
		
		memberService.login(member);
		
		return "login";
	}
	
}