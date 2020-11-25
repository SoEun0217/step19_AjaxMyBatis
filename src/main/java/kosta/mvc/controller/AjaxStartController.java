package kosta.mvc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kosta.mvc.model.dto.MemberDTO;

@RestController //@Controller + @ResponseBody
public class AjaxStartController {
	@RequestMapping(value="/load" , produces = "text/html;charset=UTF-8")
	public String load() {
		return "Spring�� Ajax�� ����";
	}
	
	@RequestMapping(value="/ajax" , produces = "text/html;charset=UTF-8")
	public String ajax(String name) {
		return  name+"�� �ݰ�����~"; 
	}
	
	/**
	 * ���� ��ü�� json���·� ��ȯ�ؼ� �������� �������ִ�
	 * jackson LIB�� ����Ѵ�.���� ó�� ���� java ��ü ������� �������ش�.
	 * */
	@RequestMapping(value="/jsonArr")
	public List<String>jsonArr(){
		List<String>list = Arrays.asList(new String[] {"���","����","����","ü��"});
		return list;
	}
	
	@RequestMapping("/jsonDto")
	public MemberDTO jonsDto() {
		return new MemberDTO("jang","������",20,"��⵵ �Ǳ�");
	}
	
	@RequestMapping("/jsonList")
	public List<MemberDTO> jsonList(){
		List<MemberDTO>list =new ArrayList<MemberDTO>();
		list.add(new MemberDTO("kim", "����", 24, "����"));
		list.add(new MemberDTO("sal", "�챸", 2, "������"));
		list.add(new MemberDTO("he", "�ҷ�", 25, "�ҷ�"));
		return list;
	}
	
	@RequestMapping("/jsonMap")
	public Map<String, Object>jsonMap(){
		Map<String,Object>map = new HashMap<String, Object>();
		map.put("message", "Spring Ajax ����ִ�..");
		map.put("pageNumber",10);
		map.put("dto",new MemberDTO("kim", "����", 24, "����"));
		List<MemberDTO>list =new ArrayList<MemberDTO>();
		list.add(new MemberDTO("kim", "����", 24, "����"));
		list.add(new MemberDTO("sal", "�챸", 2, "������"));
		map.put("list",list);
		return map;
	}
}
