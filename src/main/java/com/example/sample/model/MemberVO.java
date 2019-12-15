package com.example.sample.model;

import java.util.Date;
import lombok.Data;

@Data
public class MemberVO {

  private String userid;
  private String userpw;
  private String username;
  private String email;
  private Date regdate;
}
