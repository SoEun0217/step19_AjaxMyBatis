package kosta.mvc.model.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kosta.mvc.model.dto.StudentDTO;

public interface StudentMapper {
	/**
	 * 전체검색
	 * */
	@Select("select st_no,st_name,st_age,st_addr,st_phone from student order by st_no")
	List<StudentDTO>selectAll();
	
	@Select("<script>select st_no,st_name,st_age,st_addr,st_phone from student\r\n" + 
			"		<if test=\"_parameter!=null\">\r\n" + 
			"			<where>\r\n" + 
			"				st_no=#{_parameter}\r\n" + 
			"			</where>\r\n" + 
			"		</if>\r\n" + 
			"		order by st_no</script>")
	StudentDTO duplicateCheck(String stNo);
	
	@Insert("insert into student values(#{stNo},#{stName},#{stAge},#{stPhone},#{stAddr})")
	int insert(StudentDTO studentDTO);
	
	@Update("<script>update student\r\n" + 
			"		<set>\r\n" + 
			"			<if test=\"stName!=null\">\r\n" + 
			"				st_Name = #{stName},\r\n" + 
			"			</if>\r\n" + 
			"			<if test=\"stAge>0\">\r\n" + 
			"				st_Age = #{stAge},\r\n" + 
			"			</if>\r\n" + 
			"			<if test=\"stAddr!=null\">\r\n" + 
			"				st_Addr = #{stAddr},\r\n" + 
			"			</if>\r\n" + 
			"			<if test=\"stPhone!=null\">\r\n" + 
			"				st_Phone = #{stPhone},\r\n" + 
			"			</if>\r\n" + 
			"			</set>\r\n" + 
			"			where st_no = #{stNo}\r\n" + 
			"		</script>")
	int update(StudentDTO studentDTO);
	
	@Delete("delete from student where st_no = #{_parameter}")
	int delete(String stNo);
	
}
