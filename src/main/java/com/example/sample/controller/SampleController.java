package com.example.sample.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.example.sample.model.MemberTestVO;
import com.example.sample.service.mapper.MemberTestMapper;

@Controller
@RequestMapping(value = "/test")
public class SampleController {

  @Autowired
  private MemberTestMapper mapper;

  // @Autowired
  // private ModelAndView modelAndView;

  @GetMapping(value = "")
  @ResponseBody
  public ModelAndView samplFindAll() throws Exception {

    ModelAndView modelAndView = new ModelAndView();

    List<MemberTestVO> list = mapper.selectTestMemberList();

    list.stream().forEach(x -> System.out.println(x.getName()));;

    modelAndView.setViewName("/home.html");

    return modelAndView;
  }

}
