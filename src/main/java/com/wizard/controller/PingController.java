package com.wizard.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
   @Value("${server.port}")
   private String PORT;

   @GetMapping("/")
   public ResponseEntity<String> pingServer() {
      return ResponseEntity.ok().body("server is running at " + PORT);
   }
}
