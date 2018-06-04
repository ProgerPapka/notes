package com.ellion.controller;

import com.ellion.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/message")
public class MessageController {

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Message getTestMessage() {
        return new Message("Привет это тестовое сообщение!", LocalDateTime.now());
    }

}
