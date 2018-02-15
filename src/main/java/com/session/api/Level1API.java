package com.session.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.POST;

/**
 * Created by prasanna on 15/02/18.
 */
public class Level1API {


}

@RestController
class StudentAPI {

    @PostMapping("/getStudent")
    String getStudent() {
        return "Fetched a Student";
    }

    @PostMapping("/createStudent")
    String createStudent() {
        return "Created a Student";
    }
}

@RestController
class CollegeAPI {

    @PostMapping("/getCollege")
    String getCollege() {
        return "Fetched a College";
    }

    @PostMapping("/createCollege")
    String createCollege() {
        return "Created a College";
    }
}
