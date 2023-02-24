package springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.model.User;
import springmvc.service.UserService;

import javax.lang.model.element.NestingKind;
import javax.servlet.http.HttpServletRequest;
import java.util.Stack;

@Controller
public class ContactController {

    @Autowired
    private UserService UserService;


    @ModelAttribute
    public void commonDataForModel(Model m){
        m.addAttribute("Header","Learn Coding with Reetesh");
        m.addAttribute("Desc","IT is website to learn smart coding problems");
    }
    @RequestMapping("/contact")
    public String showform(){
        return "contact";
    }
//    @RequestMapping(path="/processform",method= RequestMethod.POST)
//    public String processform(@RequestParam(name="email",required=false) String email,
//                              @RequestParam(name="name") String name,
//                              @RequestParam(name="password") String password,Model model){
//
//        User user=new User();
//        user.setName(name);
//        user.setEmail(email);
//        user.setPassword(password);
//
//        System.out.println(user);
//
////        model.addAttribute("name",name);
////        model.addAttribute("password",password);
////        model.addAttribute("email",email);
//        model.addAttribute("user",user);
//        System.out.println(email);
//        System.out.println(name);
//        System.out.println(password);
//        return "sucess";
//    }

    @RequestMapping(path="/processform",method= RequestMethod.POST)
    public String processform(@ModelAttribute User user,Model model){

        System.out.println(user);
        this.UserService.createUser(user);
        model.addAttribute("success","User Created Successfully");
        return "sucess";
    }
}
