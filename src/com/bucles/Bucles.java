package com.bucles;

public class Bucles {
    public static void main(String[] args) {
        String[] nombres = {"Alejandro", "Andres", "Javier", "Sara"};

        String concatNombres = "";
        for (String nombre:nombres) {
            concatNombres += " " + nombre;
        }

        System.out.println(concatNombres);
    }
}
