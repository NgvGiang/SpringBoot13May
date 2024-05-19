package org.example.springboot13may.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class GirlFriend {
    private String name = "bébé";
    private int age = 20;
    private Outfit quanAo;
    @Autowired
    public GirlFriend(@Qualifier("dress") Outfit qAo){
        this.quanAo= qAo;
    }
    public void display(){
        System.out.println("Friend: " + name + " - " + age);
        quanAo.wear();
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", quanAo=" + quanAo.toString() +
                '}';
    }
}
