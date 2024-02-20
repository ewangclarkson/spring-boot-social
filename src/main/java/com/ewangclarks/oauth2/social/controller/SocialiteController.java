package com.ewangclarks.oauth2.social.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class SocialiteController {


    @GetMapping("public/message")
    public ResponseEntity<String> getMessage(){
        return ResponseEntity.ok("Testing Oauth2");
    }
}
