package pcb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pcb.model.Duck;
import pcb.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping(value = "/login",method = {RequestMethod.GET,RequestMethod.POST})
    public String login(User user, HttpServletRequest request){
        System.out.println(user.getUsername()+":"+user.getPassword());
        if("pcb".equals(user.getUsername()) && "123".equals(user.getPassword())){
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            return "redirect:/user/login6";
        }else if("a".equals(user.getUsername())){
            throw new RuntimeException("error");
        }
        return "/login.html";
    }
    @RequestMapping(value = "/login_0",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Duck login_0(User user){
        System.out.println(user.getUsername()+":"+user.getPassword());
        return new Duck("pcb",3);
    }
    @RequestMapping("/login2")
    public String login2(){
        return "/login.html";
    }

    @RequestMapping("/login3")
    public String login3(){
        return "redirect:/user/login";
    }

    @RequestMapping(value = "/{id}/login4",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Duck login4(@PathVariable("id")Integer id){
        System.out.printf("id=%s",id);
        return new Duck("pcb",2);
    }
    @RequestMapping(value = "/login5",method = {RequestMethod.POST})
    @ResponseBody
    public Duck login5(@RequestBody User user){
        System.out.println(user.getUsername()+":"+user.getPassword());
        return new Duck("pcb",3);

    }
    @RequestMapping("/login6")
    public String login6(Model model){
        model.addAttribute("duck",new Duck("pcb",3));
        return "/index";
    }
}
