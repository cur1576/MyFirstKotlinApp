package com.example.myfirstkotlinapp;

public class JavaActivity {

    Person person = new Person("Max", "Mustermann", "MusterStr","Berlin", "12345",
            80,42);

    PersonK personK = new PersonK("Max", "Mustermann", "MusterStr","Berlin", "12345",
            80,42,true);

    public String doit(){
       return personK.toString();
    }
}
