package com.mycompany.emails;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidParameterException;
import java.util.Properties;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class Mail {

    private Properties properties;
    private Session session;

    public Mail(String ruta) throws IOException {
        this.properties = new Properties();
        loadConfig(ruta);

        session = Session.getDefaultInstance(properties);
    }

    private void loadConfig(String ruta) throws InvalidParameterException, IOException {
        InputStream is = new FileInputStream(ruta);
        this.properties.load(is);
        checkConfig();
    }

    private void checkConfig() throws InvalidParameterException {

        String[] keys = {
            "mail.smtp.host",
            "mail.smtp.port",
            "mail.smtp.user",
            "mail.smtp.password",
            "mail.smtp.starttls.enable",
            "mail.smtp.auth"
        };

        for (int i = 0; i < keys.length; i++) {
            if (this.properties.get(keys[i]) == null) {
                throw new InvalidParameterException("No existe la clave " + keys[i]);
            }
        }

    }

    public void enviarEmail(String asunto, String mensaje, String correo) throws MessagingException {

        MimeMessage contenedor = new MimeMessage(session);
        String fromEmail = (String) this.properties.get("mail.from.email");
        if (fromEmail == null) {
            fromEmail = (String) this.properties.get("mail.smtp.user");
        }
        contenedor.setFrom(new InternetAddress(fromEmail));
        contenedor.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
        contenedor.setSubject(asunto);
        contenedor.setText(mensaje);
        Transport t = session.getTransport("smtp");
        t.connect((String) this.properties.get("mail.smtp.user"), (String) this.properties.get("mail.smtp.password"));
        t.sendMessage(contenedor, contenedor.getAllRecipients());

    }

    public void enviarEmail(String asunto, String mensaje, String[] correos) throws MessagingException {

        MimeMessage contenedor = new MimeMessage(session);
        String fromEmail = (String) this.properties.get("mail.from.email");
        if (fromEmail == null) {
            fromEmail = (String) this.properties.get("mail.smtp.user");
        }
        contenedor.setFrom(new InternetAddress(fromEmail));
        for (int i = 0; i < correos.length; i++) {
            contenedor.addRecipient(Message.RecipientType.TO, new InternetAddress(correos[i]));
        }
        contenedor.setSubject(asunto);
        contenedor.setText(mensaje);
        Transport t = session.getTransport("smtp");
        t.connect((String) this.properties.get("mail.smtp.user"), (String) this.properties.get("mail.smtp.password"));
        t.sendMessage(contenedor, contenedor.getAllRecipients());

    }

}