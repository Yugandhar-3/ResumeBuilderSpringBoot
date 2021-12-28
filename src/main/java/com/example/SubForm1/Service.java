package com.example.SubForm1;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    List<User> list=new ArrayList<>();
    public void addUser(User u)
    {
        //List<User> list=new ArrayList<>();
        list.add(u);
    }
    public User getUser()
    {
        return list.get(0);
    }

}
