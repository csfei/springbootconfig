package com.cuisf;

import com.cuisf.pojo.Dog;
import com.cuisf.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02ApplicationTests {


    @Autowired
    Dog dog;

    @Autowired
    Person person;
    @Test
    void contextLoads() {

        System.out.println(person);
    }

}
