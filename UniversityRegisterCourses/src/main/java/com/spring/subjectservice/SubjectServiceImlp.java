package com.spring.subjectservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.subjectvo.SubjectVO;
import com.spring.subjectdao.SubjectMapper;

@Service
@Transactional
public class SubjectServiceImlp implements SubjectService {

	@Autowired
	private SubjectMapper subjectMapper;
	
	@Override
	public List<SubjectVO> listSubject(SubjectVO param) {
		
		List<SubjectVO> list = new ArrayList<SubjectVO>();
		
		list = subjectMapper.listSubjecet(param);
		
		return list;
	}

}
