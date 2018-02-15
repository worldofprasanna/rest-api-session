package com.session.api;

import org.springframework.http.HttpRequest;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by prasanna on 15/02/18.
 */
@RestController
public class NoRestAPI {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World !!!";
    }

    public String printName() {
        return "Name is Prasanna";
    }

    public String sessionName() {
        return "REST API Documentation";
    }

    @PostMapping("/invoke")
    public String isItARestMethod(@RequestBody String methodName) {
        methodName = methodName.trim();
        System.out.println("Method name is "+methodName);
        if (methodName.trim().equals("helloWorld"))
            return helloWorld();
        else if (methodName.equals("printName"))
            return printName();
        else if (methodName.equals("sessionName"))
            return sessionName();
        return "Not a valid method";
    }
}
