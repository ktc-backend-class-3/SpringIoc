package vn.edu.likelion.springioc.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceEmail implements InterfaceService {

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}