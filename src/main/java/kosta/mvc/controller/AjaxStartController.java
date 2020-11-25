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
		return "Spring과 Ajax의 만남";
	}
	
	@RequestMapping(value="/ajax" , produces = "text/html;charset=UTF-8")
	public String ajax(String name) {
		return  name+"님 반가워요~"; 
	}
	
	/**
	 * 응답 객체를 json형태로 변환해서 뷰쪽으로 전달해주는
	 * jackson LIB를 사용한다.따로 처리 없이 java 객체 모양으로 내보내준다.
	 * */
	@RequestMapping(value="/jsonArr")
	public List<String>jsonArr(){
		List<String>list = Arrays.asList(new String[] {"사과","딸기","포도","체리"});
		return list;
	}
	
	@RequestMapping("/jsonDto")
	public MemberDTO jonsDto() {
		return new MemberDTO("jang","장희정",20,"경기도 판교");
	}
	
	@RequestMapping("/jsonList")
	public List<MemberDTO> jsonList(){
		List<MemberDTO>list =new ArrayList<MemberDTO>();
		list.add(new MemberDTO("kim", "소은", 24, "서울"));
		list.add(new MemberDTO("sal", "살구", 2, "소은집"));
		list.add(new MemberDTO("he", "할룽", 25, "할룽"));
		return list;
	}
	
	@RequestMapping("/jsonMap")
	public Map<String, Object>jsonMap(){
		Map<String,Object>map = new HashMap<String, Object>();
		map.put("message", "Spring Ajax 재미있다..");
		map.put("pageNumber",10);
		map.put("dto",new MemberDTO("kim", "소은", 24, "서울"));
		List<MemberDTO>list =new ArrayList<MemberDTO>();
		list.add(new MemberDTO("kim", "소은", 24, "서울"));
		list.add(new MemberDTO("sal", "살구", 2, "소은집"));
		map.put("list",list);
		return map;
	}
}
