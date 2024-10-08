package example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "Petya")
    public Man p1(){
        return new Man("Петя");
    }

    @Bean(name = "bibika")
    public Car c1(){
        return new Car("Бибишка", 1979);
    }

}
