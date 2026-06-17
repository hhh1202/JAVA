package com.mjc813.sbsecurity_login.biz;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionTestController {

    @GetMapping("/session/make")
    public String make( HttpSession session
            , @RequestParam("name") String name
            , @RequestParam("value") String value, Model model)
    {
        session.setAttribute(name, value);
        session.setMaxInactiveInterval(3600);
        model.addAttribute("name", name);
        model.addAttribute("value", session.getAttribute(name).toString());
        return "info/info";
    }

    @GetMapping("/cookie/delete")
    public String delete(HttpServletRequest request
            , @RequestParam("name") String name, Model model)
    {
        model.addAttribute("name", name);
        model.addAttribute("value", "");
        return "info/info";
    }
}
