package org.example.designpatterns.structural.adapter;

public class EmailHelper {
    EmailAdapter emailAdapter;

    EmailHelper(EmailAdapter emailAdapter){
     this.emailAdapter = emailAdapter;
    }
    public void sendEmail(String from, String to, String content){
        emailAdapter.sendEmail(from,to,content);
    }
}
