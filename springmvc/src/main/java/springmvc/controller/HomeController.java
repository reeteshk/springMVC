package springmvc.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/first")
public class HomeController {


    @RequestMapping(path="/home",method = RequestMethod.GET)
    public String home(Model model){
        System.out.println("this is home URL ");
        model.addAttribute("name","Reetesh Kesarwani");
        List<String>friends=new ArrayList<>();
        friends.add("Ayush");
        friends.add("Ammie");
        friends.add("shasank");
        friends.add("Zoobi");
        model.addAttribute("friends",friends);
        return "test";
    }
    @RequestMapping("/test")
    public String home2()
    {
        return "index";
    }

    @RequestMapping("/help")
    public ModelAndView help(){
        System.out.println("This is help controller");
        ModelAndView mv=new ModelAndView();
        mv.addObject("name","Reetesh Kumar");
        List<Integer> list=new ArrayList<>();
        list.add(1123);
        list.add(21231);
        list.add(3234);
        list.add(411);
        list.add(23233335);
        mv.addObject("marks",list);
        mv.setViewName("help");
        return mv;
    }

}
