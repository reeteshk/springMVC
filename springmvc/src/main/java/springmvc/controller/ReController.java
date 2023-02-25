package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

//    @RequestMapping("/one")
//    public String one(){
//System.out.println("This is one handler");
//        return "redirect:/enjoy";
//    }
@RequestMapping("/one")
public RedirectView one(){
    System.out.println("This is one handler");
    RedirectView rv=new RedirectView();
    rv.setUrl("enjoy");
    return rv;
}
   @RequestMapping("/enjoy")
    public String two(){
        System.out.println("This is two handler");
        return "contact";
    }
}
