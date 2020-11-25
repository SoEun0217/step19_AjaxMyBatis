package kosta.mvc.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kosta.mvc.model.dto.StudentDTO;
import kosta.mvc.model.repository.StudentDao;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
	
	private final StudentDao studentDao;

	@Override
	public String duplicateCheck(String stNo) {
		String result;
		if(studentDao.duplicateCheck(stNo)==null) {
			result = "아이디가 사용가능합니다.";
		}else result = "중복된 아이디 입니다.";
		return result;
	}

	@Override
	public List<StudentDTO> selectAll() {
		return studentDao.selectAll();
	}

	@Override
	public int insert(StudentDTO studentDTO) {
		return studentDao.insert(studentDTO);
	}

	@Override
	public int update(StudentDTO studentDTO) {
		return studentDao.update(studentDTO);
	}

	@Override
	public int delete(String stNo) {
		return studentDao.delete(stNo);
	}
	

}
