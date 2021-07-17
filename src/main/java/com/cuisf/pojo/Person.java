package com.cuisf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "person")
public class Person {
    @NotBlank
    private String name;

    private Integer age;

    private Boolean happy;

    private Date birth;

    private Map<String,Object> maps;

    private List<Object> list;

    private Dog dog;


}
