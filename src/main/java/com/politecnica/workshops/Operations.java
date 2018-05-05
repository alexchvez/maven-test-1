package com.politecnica.workshops;

public class Operations {
public int suma(int a, int b){
    int result = a+b;

    if(result < 10) {
        throw new RuntimeException("La suma debe ser mayor o igual a 10");
    }

    return result;
}
}
