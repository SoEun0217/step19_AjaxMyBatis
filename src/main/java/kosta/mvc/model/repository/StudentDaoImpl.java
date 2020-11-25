package kosta.mvc.model.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kosta.mvc.model.dto.StudentDTO;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private SqlSession session ;

	@Override
	public StudentDTO duplicateCheck(String stNo) {
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		return mapper.duplicateCheck(stNo);
	}

	@Override
	public int insert(StudentDTO studentDTO) {
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		return mapper.insert(studentDTO);
	}

	@Override
	public List<StudentDTO> selectAll() {
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		return mapper.selectAll();
	}

	@Override
	public int delete(String stNo) {
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		return mapper.delete(stNo);
	}

	@Override
	public int update(StudentDTO studentDTO) {
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		return mapper.update(studentDTO);
	}
	
	
	// @Override public StudentDTO duplicateCheck(String stNo) { 
	//	  return session.selectOne("studentMapper.select", stNo); }
	  
	//@Override public int insert(StudentDTO studentDTO) { 
	//  return session.delete("studentMapper.insert", studentDTO); }
	  
	//@Override public List<StudentDTO> selectAll() {
	//  return session.selectList("studentMapper.select"); }
	  
	// @Override public int delete(String stNo) {
	// return session.delete("studentMapper.delete", stNo); }
	  
	// @Override public int update(StudentDTO studentDTO) {
	//  return session.update("studentMapper.update", studentDTO); }
	 

	
}
