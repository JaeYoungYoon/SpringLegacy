package edu.global.ex.board.one;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.global.ex.vo.BoardVO;

@Service
public class BService1 {
   
   @Inject
   private SqlSession sqlSession;
   
    public List<BoardVO> selectBoardList() throws Exception {
       
       IBDao dao = sqlSession.getMapper(IBDao.class);
      
       return dao.listDao();
    }

}
