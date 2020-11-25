package kosta.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kosta.mvc.model.dto.StudentDTO;
import kosta.mvc.model.service.StudentService;

@RestController//�񵿱�ȭ�� restController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	/**
	 * �ߺ�üũ
	 * */
	@RequestMapping(value = "/check" ,produces = "text/html;charset=UTF-8")
	public String duplicateCheck(String stNo) {
		return studentService.duplicateCheck(stNo);
	}
	
	/**
	 * ���
	 * */
	@RequestMapping(value = "/insert", produces = "text/html;charset=UTF-8")
	public String insert(StudentDTO studentDTO) {
		String result = "��Ͻ���";
		if(studentService.insert(studentDTO)>0) result="��ϿϷ�";
		return result;
	}
	
	/**
	 * ��ü�˻�
	 * */
	@RequestMapping(value = "/select")
	public List<StudentDTO> select(){
		return studentService.selectAll();
	}
	
	/**
	 * ����
	 * */
	@RequestMapping(value = "/delete",produces = "text/html;charset=UTF-8")
	public String delete(String stNo) {
		String result = "��������";
		if(studentService.delete(stNo)>0) result="��������";
		return result;
	}
	
	/**
	 * ����
	 * */
	@RequestMapping(value = "/update", produces = "text/html;charset=UTF-8")
	public String update(StudentDTO studentDTO) {
		String result = "��������";
		if(studentService.update(studentDTO)>0)result="�����Ϸ�";
		return result ;
	}
}
