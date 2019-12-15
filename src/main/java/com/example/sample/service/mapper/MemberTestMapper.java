package com.example.sample.service.mapper;

import java.util.List;
import com.example.sample.model.MemberTestVO;

public interface MemberTestMapper {

  public List<MemberTestVO> selectTestMemberList() throws Exception;

}
