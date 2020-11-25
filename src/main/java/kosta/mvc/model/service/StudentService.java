package kosta.mvc.model.service;

import java.util.List;

import kosta.mvc.model.dto.StudentDTO;

public interface StudentService {
	/**
	 * �ߺ�üũ
	 * @return : "�ߺ��Դϴ�" or "��밡���մϴ�."
	 * */
	String duplicateCheck(String stNo);
	/**
	 * ��ü�˻�
	 * */
	List<StudentDTO>selectAll();
	/**
	 * ����ϱ�
	 * */
	int insert(StudentDTO studentDTO);
	
	/**
	 * �����ϱ�
	 * */
	int update(StudentDTO studentDTO);
	
	/**
	 * �����ϱ�
	 * */
	int delete(String stNo);
}
