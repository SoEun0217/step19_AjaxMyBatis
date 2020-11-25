package kosta.mvc.model.repository;

import java.util.List;

public interface SuggestDao {
	/**
	 * 전달된 단어로 시작하는 레코드 검색하기
	 * */
	List<String> suggestSelect(String keyWord);
}
