package com.jp.sslServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SslServerController {
	
	@GetMapping(value = "/sslserver")
    public String callSslServer() {

		System.out.println("Call to SSL Server");

        return "Hello from SSL Server";

    } 

}
