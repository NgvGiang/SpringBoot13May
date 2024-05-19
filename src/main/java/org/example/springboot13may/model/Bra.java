package org.example.springboot13may.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bra")
public class Bra implements Outfit{
    @Override
    public void wear() {
        System.out.println("Wearing a bra");
    }
    @Override
    public String toString() {
        return "Bra";
    }
}
