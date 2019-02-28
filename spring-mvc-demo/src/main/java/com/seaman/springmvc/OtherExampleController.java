package com.seaman.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OtherExampleController {
    @RequestMapping("/other")
    public String requestResponseExample(HttpServletRequest request,
                                         HttpServletResponse reponses, Model model) {

        // Todo something here

        return "otherexample";
    }

}
