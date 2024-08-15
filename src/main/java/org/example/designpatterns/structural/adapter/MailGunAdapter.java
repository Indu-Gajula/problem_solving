package org.example.designpatterns.structural.adapter;

import org.example.designpatterns.structural.adapter.libraries.MailGun;

public class MailGunAdapter implements EmailAdapter{

    MailGun client = new MailGun();
    @Override
    public void sendEmail(String from, String to, String content) {
        client.sendEmail(from,to,content);
    }
}
