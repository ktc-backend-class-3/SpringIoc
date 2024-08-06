package vn.edu.likelion.springioc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import vn.edu.likelion.springioc.service.InterfaceService;

@Component
public class Client {
    @Autowired
    @Qualifier("serviceEmail")
    private InterfaceService interfaceService;

    public void print(String message) {
        interfaceService.print(message);
    }
}
