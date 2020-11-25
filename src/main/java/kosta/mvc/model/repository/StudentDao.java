package kosta.mvc.model.repository;

import java.util.List;

import kosta.mvc.model.dto.StudentDTO;

public interface StudentDao {
	/**
	 * �ߺ�üũ
	 * */
	StudentDTO duplicateCheck(String stNo);
	
	/**
	 * ����ϱ�
	 * */
	int insert(StudentDTO studentDTO);
	
	/**
	 * ��ü�˻�
	 * */
	List<StudentDTO> selectAll();
	
	/**
	 * �����ϱ�
	 * */
	int delete(String stNo);
	
	/**
	 * �����ϱ�
	 * */
	int update(StudentDTO studentDTO);
	
}
