package uz.ibrokhimoff.appclickup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ibrokhimoff.appclickup.payload.ApiResponse;
import uz.ibrokhimoff.appclickup.payload.RegisterDTO;
import uz.ibrokhimoff.appclickup.service.AuthService;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/auth")
public class AuthController {


    @Autowired
    AuthService authService;

    @PostMapping
    public HttpEntity<?> registerUser(@Valid @RequestBody RegisterDTO registerDTO){
        //ApiResponse apiResponse=authService.registerUser(registerDTO);

        return null;
    }
}
