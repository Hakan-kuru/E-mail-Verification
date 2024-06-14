package org.login;

import javax.mail.MessagingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MessagingException {
        
        Scanner scanner= new Scanner(System.in);
        String recipientEmail = "recipient@example.com";
        System.out.println("name of the person to send");
        String name = scanner.nextLine();
        Verification.verificationMain(recipientEmail, name);
        scanner.close();
        
    }
}
