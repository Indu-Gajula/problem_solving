package org.example.designpatterns.structural.adapter.libraries;
// should be a library - for simolicity we are doing this way
public class SendGrid {
    public void sendEmail(String from, String to, String content){
        System.out.println("sent email from SendGrid");
    }
}
