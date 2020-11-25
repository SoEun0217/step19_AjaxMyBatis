package kosta.mvc.model.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //생성
public class SuggestDaoImpl implements SuggestDao {
	
	@Autowired //주입
	private SqlSession session;//공유되지 않는다.

	@Override
	public List<String> suggestSelect(String keyWord) {
		//알아서 세션을 닫아준다.
		return session.selectList("suggestMapper.suggest", keyWord);
	}

}
