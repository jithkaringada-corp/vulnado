package com.scalesec.vulnado;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.*;

import java.io.Serializable;

@RestController
@EnableAutoConfiguration
public class CowController {
    @RequestMapping(value = "/cowsay")
    String cowsay(@RequestParam(defaultValue = "I love Linux!") String input) {
        boolean stringOnlyChars = input.matches("[a-zA-Z]+");
        if(stringOnlyChars) {
            return Cowsay.run(input);
        }
        else {
            return "";
        }
    }
}
