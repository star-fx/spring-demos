package me.fx.springdemos.web;

import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@RestController
@RequestMapping(path = "/validate-method-param", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class ValidateMethodParamController {
    @GetMapping("/string")
    public String validateMethodParameter(
        @Valid
        @NotBlank
        @Size(min = 3, max = 10, message = "name should between 3 and 10 chars")
        @RequestParam("name") String name) {
        return name;
    }
}
