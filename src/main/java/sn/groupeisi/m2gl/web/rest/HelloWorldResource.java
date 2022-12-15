package sn.groupeisi.m2gl.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldResource {

    @GetMapping("/helloworld")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("{\"value\": \"Je suis MS1 - Fallou MBOW\"}");
    }
}
