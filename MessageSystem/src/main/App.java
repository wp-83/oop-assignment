package main;

import Interface.ILogin;
import login.*;
import message.*;

public class App {
    public static void main(String[] args) {
        ILogin emailLogin = new BasicLogin("alice", "password123");
        ILogin smsLogin = new OAuthLogin("token-abc-123");

        Message email = new EmailMessage(emailLogin, "alice@example.com", "bob@example.com", "Hello Bob!");
        Message sms = new SMSMessage(smsLogin, "Alice", "Bob", "Hi Bob, this is Alice.");

        email.send("alice", "password123");
        sms.send("anyuser", "token-abc-123");

        email.send("alice", "wrongpass");
        sms.send("anyuser", "wrongtoken");
    }
}

//penerapan dari single responsibility ada pada setiap class yang dibuat di mana setiap class hanya menjalankan tugas spesifik yang berkaitan dengan class tersebut.