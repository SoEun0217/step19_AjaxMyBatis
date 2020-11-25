package kosta.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kosta.mvc.model.dto.StudentDTO;
import kosta.mvc.model.service.StudentService;

@RestController//비동기화는 restController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	/**
	 * 중복체크
	 * */
	@RequestMapping(value = "/check" ,produces = "text/html;charset=UTF-8")
	public String duplicateCheck(String stNo) {
		return studentService.duplicateCheck(stNo);
	}
	
	/**
	 * 등록
	 * */
	@RequestMapping(value = "/insert", produces = "text/html;charset=UTF-8")
	public String insert(StudentDTO studentDTO) {
		String result = "등록실패";
		if(studentService.insert(studentDTO)>0) result="등록완료";
		return result;
	}
	
	/**
	 * 전체검색
	 * */
	@RequestMapping(value = "/select")
	public List<StudentDTO> select(){
		return studentService.selectAll();
	}
	
	/**
	 * 삭제
	 * */
	@RequestMapping(value = "/delete",produces = "text/html;charset=UTF-8")
	public String delete(String stNo) {
		String result = "삭제실패";
		if(studentService.delete(stNo)>0) result="삭제성공";
		return result;
	}
	
	/**
	 * 수정
	 * */
	@RequestMapping(value = "/update", produces = "text/html;charset=UTF-8")
	public String update(StudentDTO studentDTO) {
		String result = "수정실패";
		if(studentService.update(studentDTO)>0)result="수정완료";
		return result ;
	}
}
