package annotations.springdemocoach;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Here is a happy fortune";
    }
}
