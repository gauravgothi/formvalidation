package com.gaurav.springboot.validation.controller;

import com.gaurav.springboot.validation.entity.UserLogin;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class ValidationController {
    @RequestMapping(value = "/loginform", method = RequestMethod.GET)
    public String openform(Model model)    {
        model.addAttribute("userLogin",new UserLogin());
        return "loginform";
    }

    @RequestMapping(value = "/process" ,method = RequestMethod.POST)
    public String processform(@Valid @ModelAttribute("userLogin") UserLogin userLogin, BindingResult result){
        if(result.hasErrors())  {
            System.out.println(result);
            return "error";
        }
        System.out.println(userLogin);
        return "success";
    }
}
