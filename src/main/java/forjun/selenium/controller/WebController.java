package forjun.selenium.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/use_page")
    public ResponseEntity<String> usePage(HttpServletRequest request) {

        return ResponseEntity.ok().body("hellor");
    }
}
