package com.session.api;

import org.springframework.web.bind.annotation.GetMapping;
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

}
