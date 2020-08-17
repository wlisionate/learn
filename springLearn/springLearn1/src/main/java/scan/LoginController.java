package scan;

import model.Duck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private Duck duck1;

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public Duck getDuck1() {
        return duck1;
    }

    public void setDuck1(Duck duck1) {
        this.duck1 = duck1;
    }
}
