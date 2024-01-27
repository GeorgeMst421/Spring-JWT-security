package com.georgemst.jwt.demo.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {


    @GetMapping
    public ResponseEntity<String> demoControllerMethod(){
        return ResponseEntity.ok("Get request on /api/v1/demo-controller, status ok");
    }

}
