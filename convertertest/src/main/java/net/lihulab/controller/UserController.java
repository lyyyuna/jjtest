package net.lihulab.controller;

import net.lihulab.domain.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    private static final Log logger = LogFactory.getLog(UserController.class);

    @RequestMapping(value="/{formName}")
    public String loginForm(@PathVariable String formName) {
        return formName;
    }

    @RequestMapping(value="/register",method= RequestMethod.POST)
    public String register(
            @ModelAttribute User user,
            Model model) {
        logger.info(user);
        model.addAttribute("user", user);
        return "success";
    }
}
