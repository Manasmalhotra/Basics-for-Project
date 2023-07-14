package org.example;
import http.Client;
public class Main {
    public static void main(String[] args) {

        Greeting greet=new Greeting();
        System.out.println(greet.printplease());
        System.out.println("Hello world!");
        Client client = new Client();
        String response = client.get("https://example.com");
        System.out.println(response);
    }
}