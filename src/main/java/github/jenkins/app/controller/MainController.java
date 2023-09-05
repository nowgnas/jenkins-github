package github.jenkins.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("hello jenkins test ");
    }
}
