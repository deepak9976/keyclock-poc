package com.deepak.keyclockpoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(path = "/admin")
        public ModelAndView getadminPage(){
        ModelAndView modelAndView  = new ModelAndView("admin");
        return modelAndView;
    }

    @GetMapping (path = "/persons")
    public List<String> getPersons(){
        return personService.getPersons();

    }

    @GetMapping(path = "/logout")

    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }


}
