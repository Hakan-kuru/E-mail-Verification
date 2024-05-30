package org.login;

import javax.mail.MessagingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MessagingException {
        /*
        to = alıcı e maili
        subject = konu
        String body = içi
        */
        Scanner scanner= new Scanner(System.in);
        System.out.println("write e-mail  ");
        String to = scanner.nextLine();
        System.out.println("name of the person to send");
        String name = scanner.nextLine();
        Verification.verificationMain(to, name);
        scanner.close();
    }
}