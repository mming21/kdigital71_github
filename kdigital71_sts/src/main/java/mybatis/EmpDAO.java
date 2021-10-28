package mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Mapper //인식하기 위해 @mapper scan 어노테이션 필요.
@Repository //이를 인식하기 위해 @component-scan annotation 필요
public interface EmpDAO {
	/*
	 * @Autowired SqlSession session ;//SqlSessionTemplate 객체 생성(
	 * spring-mybatis.xml파일 설정)
	 * =@Mapper가 위 두문장을 대신함.
	 */
	
	public List<EmpVO> emplist();
	
	//1. 메소드 이름을 session.xxx("emp.mapping파일 id",xxx);
	//2. 메소드 구현부 삭제
	//3. EmpService, EmpServiceImpl 주석해제, dao 호출메소드 수정
	//4. controller /empdeptlist 주석 해제 후 실행되는지 확인
	
	public EmpVO empone(int id);
	
	public void insertemp(EmpVO vo);
	
	public void updateemp(EmpVO vo);
	
	public void deleteemp(String name);
	
	public int cnt();
	
	public List<EmpVO> empdeptlist(int [] dept_list);
}
















