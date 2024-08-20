package org.example.designpatterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        EmailHelper eh = new EmailHelper(new MailGunAdapter());
        eh.sendEmail("indu","goldmansachs","thank for the opportunity");
        EmailHelper eh1 = new EmailHelper(new SendGridAdapter());
        eh1.sendEmail("indu","goldmansachs","thank for the opportunity");
    }
}
