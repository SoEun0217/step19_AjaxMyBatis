package kosta.mvc.model.service;

import java.util.List;

import kosta.mvc.model.dto.StudentDTO;

public interface StudentService {
	/**
	 * 중복체크
	 * @return : "중복입니다" or "사용가능합니다."
	 * */
	String duplicateCheck(String stNo);
	/**
	 * 전체검색
	 * */
	List<StudentDTO>selectAll();
	/**
	 * 등록하기
	 * */
	int insert(StudentDTO studentDTO);
	
	/**
	 * 수정하기
	 * */
	int update(StudentDTO studentDTO);
	
	/**
	 * 삭제하기
	 * */
	int delete(String stNo);
}
