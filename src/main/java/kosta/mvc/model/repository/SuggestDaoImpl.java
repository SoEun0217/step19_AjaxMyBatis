package kosta.mvc.model.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //����
public class SuggestDaoImpl implements SuggestDao {
	
	@Autowired //����
	private SqlSession session;//�������� �ʴ´�.

	@Override
	public List<String> suggestSelect(String keyWord) {
		//�˾Ƽ� ������ �ݾ��ش�.
		return session.selectList("suggestMapper.suggest", keyWord);
	}

}
