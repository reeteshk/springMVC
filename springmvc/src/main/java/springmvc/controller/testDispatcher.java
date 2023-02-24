package springmvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ViewResolver;

public class testDispatcher {
    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("spring-servlet.xml");
        ViewResolver vr=(ViewResolver) context.getBean("viewResolver");

        System.out.println(vr);
    }
}
