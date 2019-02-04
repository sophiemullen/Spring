package annotations;

import annotations.springdemocoach.domain.Coach;
import annotations.springdemocoach.domain.SwimCoach;
import annotations.springdemocoach.service.FortuneService;
import annotations.springdemocoach.service.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("annotations.springdemocoach") // not needed for swim demo app
@PropertySource("classpath:annotations/sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
//        Gives a reference to the bean, and Spring will intercept and give us a
//        reference to the corresponding object based on the bean scope
    }
}
