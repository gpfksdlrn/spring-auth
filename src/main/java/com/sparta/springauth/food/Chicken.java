package com.sparta.springauth.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // @Primary 는 같은 타입의 Bean 이 여러개 있더라도 기본적으로 주입할 Bean 을 지정함
public class Chicken implements Food {

    @Override
    public void eat() {
        System.out.println("치킨을 먹습니다.");
    }
}
