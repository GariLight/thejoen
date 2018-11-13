package mvc.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mvc.model.BoardDTO;
import mvc.model.ListDTO;

@Transactional
@Service
public class BoardDAO {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public Object list(BoardDTO dto) {
		
		return sqlSessionTemplate.selectList("boardMM.list",dto);
		
	}
	
	public int insertOne(BoardDTO dto) {
		
		return sqlSessionTemplate.insert("boardMM.insertOne", dto);
	}
	
	public Object selectDetail(BoardDTO dto) {
		
		return sqlSessionTemplate.selectOne("boardMM.selectDetail", dto.getId());
	}
	
	public void addCount(BoardDTO dto) {
		
		sqlSessionTemplate.update("boardMM.addCount", dto);
	}
	
	public int delDetail(BoardDTO dto) {
		
		return sqlSessionTemplate.delete("boardMM.delDetail", dto);
	}

	public int modifyDetail(BoardDTO dto) {
		
		return sqlSessionTemplate.update("boardMM.modify", dto);
	}

	public void insertList(ListDTO dto) {

		sqlSessionTemplate.insert("boardMM.insertList", dto);
	}
	
	
	public void insertError(ListDTO dto) throws Exception{
		for(BoardDTO dto2 : dto.getMem())
		 sqlSessionTemplate.insert("boardMM.insertError", dto2);
		
	}
}
