package com.jsf;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class UserBean {
    private String name;
    private String email;
    private String message;
    private boolean submitted;

    public String submit() {
        this.submitted = true;
        return null;
    }

    public String reset() {
        this.name = "";
        this.email = "";
        this.message = "";
        this.submitted = false;
        return null;
    }

    // Getters and Setters
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
