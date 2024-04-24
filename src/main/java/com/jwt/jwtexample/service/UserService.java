package com.jwt.jwtexample.service;

import com.jwt.jwtexample.models.Userr;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service

public class UserService {
    private List<Userr> store=new ArrayList<>();
    public  UserService(){
        store.add(new Userr(UUID.randomUUID().toString(),"Kritika","kr@gmail.com"));
        store.add(new Userr(UUID.randomUUID().toString(),"Harsh","hr@gmail.com"));
        store.add(new Userr(UUID.randomUUID().toString(),"Ankita","an@gmail.com"));
        store.add(new Userr(UUID.randomUUID().toString(),"Gautam","gua@gmail.com"));


        }
    public List<Userr>getUsers(){
        return this.store;

    }
}
