package com.example.demojsfjava2023.ihm;



import com.example.demojsfjava2023.validators.Email;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;

@Getter @Setter
@Named // loginBean
@SessionScoped
public class LoginBean implements Serializable {
    @NotBlank @Size(min = 1)
    private String login;
    @Email
    private String email;

    @Size(min = 3, max = 12)
    private String password;

    public String returnAction(){

        return this.password.equals("toto") ? "success" : "failure";
    }
}
