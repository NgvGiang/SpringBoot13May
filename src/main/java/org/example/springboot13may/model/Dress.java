package org.example.springboot13may.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dress")
public class Dress implements Outfit{
    @Override
    public void wear() {
        System.out.println("Wearing a dress");
    }
    @Override
public String toString() {
        return "Dress";
    }
}
