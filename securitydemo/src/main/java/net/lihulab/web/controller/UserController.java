package net.lihulab.web.controller;

import net.lihulab.dto.User;
import net.lihulab.dto.UserQueryCondition;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> query(UserQueryCondition userQueryCondition, Pageable pageable) {

        System.out.println(ReflectionToStringBuilder.toString(userQueryCondition, ToStringStyle.MULTI_LINE_STYLE));

        System.out.println(pageable.getPageSize());
        System.out.println(pageable.getPageNumber());
        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }

    @PutMapping("/{id:\\d+}")
    public User update(@Valid @RequestBody User user, BindingResult errors) {

        if (errors.hasErrors()) {
            errors.getAllErrors().stream().forEach( error -> {
                System.out.println(error.getDefaultMessage());
            });
        }
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        return user;
    }

    @PutMapping("/ids/{ids:\\d+}")
    public User update2(@Valid @RequestBody User user) {

        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        return user;
    }
}
