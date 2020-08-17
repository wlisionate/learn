package scan;

import model.Duck;
import model.DuckShop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {
    @Bean("duck66")
    public Duck duckShop(){
        return new Duck();
    }

    @Bean
    public DuckShop duckShop2(Duck duck1,Duck duck2){
        List<Duck> list = new ArrayList<>();
        DuckShop duckShop = new DuckShop();
        System.out.println(duck1+" "+duck2);
        list.add(duck1);
        list.add(duck2);
        duckShop.setDucks(list);
        return duckShop;
    }
}
