package com.example.sample;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@WebAppConfiguration
class SamplesApplicationTests {

  @Autowired
  private SqlSessionFactory sqlSession;

  @Test
  void contextLoads() {}

  @Test
  public void testSqlSession() throws Exception {
    System.out.println(sqlSession);
  }
}
