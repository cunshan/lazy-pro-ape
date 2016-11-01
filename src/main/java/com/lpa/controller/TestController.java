package com.lpa.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by GL on 2016/10/14.
 */
@Controller
public class TestController {

  private static final Logger logger = LoggerFactory.getLogger(TestController.class);



  @RequestMapping("/test")
  public String index(HttpServletRequest request, ModelAndView mv) {
    mv.addObject("name","名称");
    return "test/test";

  }

}
