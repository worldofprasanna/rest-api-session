package com.session.api;

import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

/**
 * Created by prasanna on 15/02/18.
 */
@RestController
public class Level2API {

//    @GetMapping("cache/demo")
//    public String getCachedPages(HttpServletResponse response){
//        String headerValue = CacheControl.maxAge(10, TimeUnit.SECONDS)
//                .getHeaderValue();
//
//        response.addHeader("Cache-Control", headerValue);
//        return "testPage";
//    }

}

@RestController("/student")
class Level2StudentAPI {

    @GetMapping("/")
    ResponseEntity<String> getStudent() {
        System.out.println("Getting a student");
        return ResponseEntity.ok()
                .cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
                .body("Fetched a student");
    }

    @PostMapping("/")
    ResponseEntity<String> createStudent() {
        return ResponseEntity.ok()
                .body("Created a Student");
    }
}

@RestController("/college")
class Level2CollegeAPI {

    @GetMapping
    ResponseEntity<String> getCollege() {
        System.out.println("Getting a College");
        return ResponseEntity.ok()
                .cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
                .body("Fetched a College");
    }

    @PostMapping
    ResponseEntity<String> createCollege() {
        return ResponseEntity.ok()
                .body("Created a College");
    }

}
