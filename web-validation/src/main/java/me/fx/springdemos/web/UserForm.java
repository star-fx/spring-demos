package me.fx.springdemos.web;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserForm {
    @NotBlank(message = "{UserForm.name.NotBlank}")
    @Size(min = 3, message = "{UserForm.name.Size}")
    private String name;

    @NotNull
    @Min(value = 18, message = "{UserForm.age.Min}")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
