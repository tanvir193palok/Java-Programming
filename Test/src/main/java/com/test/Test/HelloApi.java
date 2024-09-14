package com.test.Test;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloApi {

    @GetMapping("/hello")
    public HelloResponse  hello() {
        return new HelloResponse("Hello world!");
    }

    @GetMapping("/hello/{name}")
    public HelloResponse  helloParam(@PathVariable String name) {
        return new HelloResponse("Hello " + name);
    }

    @PostMapping("/hello")
    public String helloPost(@RequestBody String name) {
        return "Hello " + name + " !";
    }
}
