package com.session.api;

import lombok.Data;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by prasanna on 15/02/18.
 */
@RestController
public class Level3API {

    @GetMapping("/hateaos/students")
    public ResponseEntity<Student> getHateaosStudent() {
        Student student = new Student();
        student.setName("Prasanna");
        student.setCollege("College-A");
        student.add(linkTo(methodOn(Level3API.class).getHateaosStudent()).withSelfRel());
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

}

@Data
class Student extends ResourceSupport {
    String name;
    String college;
}
