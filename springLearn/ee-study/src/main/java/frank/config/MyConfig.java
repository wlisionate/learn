package frank.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())//所有匹配的路径，都会进入拦截器
                .addPathPatterns("/1/**")//**代表所有子路径，*只匹配一级路径，添加路径
                .excludePathPatterns("/1/login5");//排除路径
    }
}
