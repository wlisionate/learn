package frank.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionAdvisor {
    /**
     * 进行异常拦截，打印异常信息
     * @param
     * @return
     */
//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public Object handle(Exception e){
//        Map<String,String> map = new HashMap<>();
//        map.put("error",e.getMessage());
//        StringWriter sw = new StringWriter();
//        PrintWriter pw = new PrintWriter(sw);
//        e.printStackTrace(pw);
//        map.put("stackTrace",sw.toString());
//        return map;
//    }
    @ExceptionHandler(Exception.class)
    public Object handle(HttpServletResponse response)  {
        try {
            response.sendRedirect("error.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
