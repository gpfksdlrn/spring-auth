package com.sparta.springauth.food;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pizza") // @Qualifier("별칭") 을 사용하면 명시적으로 해당 이름의 Bean 을 주입함
// @Primary 설정과 상관없이 @Qualifier 로 원하는 Bean 을 지정하여 주입할 수 있음
public class Pizza implements Food{

    @Override
    public void eat() {
        System.out.println("피자를 먹습니다.");
    }
}
