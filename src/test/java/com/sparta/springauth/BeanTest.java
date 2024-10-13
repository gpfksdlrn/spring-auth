package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    // @Autowired 는 기본적으로 타입을 기준으로 Bean 을 주입함.
    // 같은 타입의 Bean(Chicken, Pizza)이 여러 개 있을 때, @Primary 설정된 Bean 이 우선 주입됨.
    // 하지만 @Qualifier 를 사용하면 특정 이름의 Bean 을 명시적으로 주입할 수 있음.
    @Autowired
    @Qualifier("pizza")
    Food food;

    @Test
    @DisplayName("Primary 와 Qualifier 우선순위 확인")
    void test1() {
        food.eat();
    }

}
