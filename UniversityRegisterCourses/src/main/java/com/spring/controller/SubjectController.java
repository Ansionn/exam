package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.subjectvo.SubjectVO;
import com.spring.subjectservice.SubjectService;

@Controller
@RequestMapping(value="/subject")	// URL 매핑명
public class SubjectController {
	
	private String CONTEXT_PATH = "subject";		// views폴더 에 있는 폴더명
	
	@Autowired
	private SubjectService subjectService;
	
	/* 학과 전체 목록 조회 */
	@RequestMapping("/listSubject")	// URL 매핑명
	public ModelAndView listSubject(@ModelAttribute SubjectVO param) {
		
		List<SubjectVO> list = subjectService.listSubject(param);	// subjectService에 있는 listSubject(param)이라는 결과값을 가져온다.
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("subjectList", list);			// subjectList가 JSP에서 사용하는 객체명
		
		mav.setViewName(CONTEXT_PATH + "/subject");		// /subject는 JSP 파일명
		
		return mav;
	}
}
