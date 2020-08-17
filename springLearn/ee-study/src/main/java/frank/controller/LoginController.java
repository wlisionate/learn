package frank.controller;

import frank.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/1")
public class LoginController {

    @RequestMapping("/login")
    @ResponseBody
    public String login(Integer i){
        if(i == 1) {
            return "redirect:/index.html";
        }
        else {
            return "forward:/index.html";
        }
    }
    @RequestMapping(value = "/login1",method = RequestMethod.POST)
    @ResponseBody
    public User login1(@RequestBody User user){
        System.out.println(user);
        return user;
    }
    @RequestMapping(value = "/login2",method = RequestMethod.POST)
    @ResponseBody
    public User login2(@RequestBody User user){
        System.out.println(user);
        return user;
    }
    @RequestMapping(value = "/login3",method = RequestMethod.POST)
    @ResponseBody
    public User login3(HttpServletRequest request, HttpServletResponse response, @RequestBody User user){
        System.out.println(user);
        if(user.getUsername().equals("pcb") && user.getPassword().equals("123456")){
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
        }
        return user;
    }
    //settings-keymap-eclipse: ctrl+alt+向下方向键
    @RequestMapping(value = "/login4", method = RequestMethod.POST)
    @ResponseBody
    public Object login4( User u){
        System.out.println(u);
        User user = new User();
        user.setUsername("烤鸭");
        user.setPassword("123");
        return user;
    }
    @RequestMapping(value = "/login5", method = RequestMethod.POST)
    @ResponseBody
    public Object login5(HttpServletRequest request, HttpServletResponse response,
                         User u){
        if("pcb".equals(u.getUsername()) && "123".equals(u.getPassword())){
            HttpSession session = request.getSession();
            session.setAttribute("user", u);
            User user = new User();
            user.setUsername("烤鸭");
            user.setPassword("123");
            return user;
        }
        throw new RuntimeException("登录不成功");
    }
}
