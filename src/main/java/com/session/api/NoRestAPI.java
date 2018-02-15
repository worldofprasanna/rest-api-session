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

    public String getStudent() {
        return "Fetched Student";
    }

    public String getCollege() {
        return "Fetched College";
    }

    @PostMapping("/invoke")
    public String isItARestMethod(@RequestBody String resource) {
        resource = resource.trim();
        System.out.println("Method name is "+resource);
        if (resource.trim().equals("helloWorld"))
            return helloWorld();
        else if (resource.equals("getStudent"))
            return getStudent();
        else if (resource.equals("getCollege"))
            return getCollege();
        return "Not a valid method";
    }
}
