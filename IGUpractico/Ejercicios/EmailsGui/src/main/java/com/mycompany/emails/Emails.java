package com.mycompany.emails;


import jakarta.mail.MessagingException;
import java.io.IOException;
import java.security.InvalidParameterException;

public class Emails {

    public static void main(String[] args) {

        try {
            Mail m = new Mail("config/config.prop");
            m.enviarEmail("Test", "Hola mundo", "mauriciofarroizquierdo@gmail.com");

            System.out.println("Se ha enviado!!");
        } catch (InvalidParameterException | MessagingException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}