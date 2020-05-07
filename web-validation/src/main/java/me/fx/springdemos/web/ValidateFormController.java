package me.fx.springdemos.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "/validate-form")
public class ValidateFormController {
    @GetMapping
    public String displayForm(@ModelAttribute("userForm") UserForm userForm) {
        return "user";
    }

    @PostMapping
    public String postForm(
        @ModelAttribute("userForm") @Valid UserForm userForm,
        BindingResult bindingResult,
        Model model) {
        if (bindingResult.hasErrors()) {
            return "user";
        }
        model.addAttribute("userForm", userForm);
        return "user";
    }
}
