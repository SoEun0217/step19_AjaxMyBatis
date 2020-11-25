package kosta.mvc.model.repository;

import java.util.List;

import kosta.mvc.model.dto.StudentDTO;

public interface StudentDao {
	/**
	 * 중복체크
	 * */
	StudentDTO duplicateCheck(String stNo);
	
	/**
	 * 등록하기
	 * */
	int insert(StudentDTO studentDTO);
	
	/**
	 * 전체검색
	 * */
	List<StudentDTO> selectAll();
	
	/**
	 * 삭제하기
	 * */
	int delete(String stNo);
	
	/**
	 * 수정하기
	 * */
	int update(StudentDTO studentDTO);
	
}
