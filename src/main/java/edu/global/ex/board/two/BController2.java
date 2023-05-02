package edu.global.ex.board.two;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BController2 {

   @Inject
   BService2 bservice;
   
   @RequestMapping("/list2")
   public String list(Model model) throws Exception{
      System.out.println("list2()");   
      
      model.addAttribute("boards", bservice.selectBoardList());         
      return "list";      
   }
}