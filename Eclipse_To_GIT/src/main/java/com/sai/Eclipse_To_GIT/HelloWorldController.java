
package com.sai.Eclipse_To_GIT;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
 
 @RequestMapping("/helloworld")
 public ModelAndView hello() {
 
  String helloWorldMessage = "Hello world  from Eclipse....updating in git.";
  return new ModelAndView("hello", "message", helloWorldMessage);
 }
}


