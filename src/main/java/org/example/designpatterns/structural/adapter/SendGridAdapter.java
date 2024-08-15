package org.example.designpatterns.structural.adapter;

import org.example.designpatterns.structural.adapter.libraries.SendGrid;

public class SendGridAdapter implements EmailAdapter{
    SendGrid client = new SendGrid();
    @Override
    public void sendEmail(String from, String to, String content) {
        client.sendEmail(from,to,content);
    }
}
