package com.jsf;

import com.jsf.entity.UserEntity;
import com.jsf.service.UserService;
import com.jsf.util.SpringContext;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class UserBean {

    private UserService userService;

    private String name;
    private String email;
    private String message;
    private boolean submitted;

    @PostConstruct
    public void init() {
        userService = SpringContext.getBean(UserService.class);
    }

    public String submit() {
        UserEntity user = new UserEntity();
        user.setName(name);
        user.setEmail(email);

        userService.saveUser(user);

        message = "Saved to Oracle database successfully.";
        submitted = true;
        return null;
    }

    public String reset() {
        name = "";
        email = "";
        message = "";
        submitted = false;
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public void setSubmitted(boolean submitted) {
        this.submitted = submitted;
    }
}
