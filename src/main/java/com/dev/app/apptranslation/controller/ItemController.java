package com.dev.app.apptranslation.controller;

import com.dev.app.apptranslation.config.Translator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @RequestMapping(method = RequestMethod.GET, path = "/stock")
    public String welcome() {
        return Translator.toLocale("message.stock"); 
    }
}
