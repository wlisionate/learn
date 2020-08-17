package pcb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import pcb.model.Duck;
import sun.misc.Contended;

import java.util.function.DoubleUnaryOperator;

@ControllerAdvice
@Configuration
public class ControllerInterceptor {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Duck handle(){
        return new Duck("异常",123);
    }
}
