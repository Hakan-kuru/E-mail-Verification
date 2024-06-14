package org.login;

import javax.mail.MessagingException;
import java.util.Random;
import java.util.Scanner;

public class VerificationCodeGenerator {
    private static boolean Verifaction(String name, String to ) throws MessagingException {
        int code= Random();
        Scanner scanner =new Scanner(System.in);
        int kod ;
        int denemeHakki =3;
        String subject= "site adı";
        String body = "Hi! " + name + "\n 'X'  your verification code to register on our site:\n "+code;

        if (EmailService.sendEmail(to, subject, body)) {
            while (denemeHakki > 0) {
                kod = scanner.nextInt();
                if (kod == code)
                    return true;
                else {
                    denemeHakki -= 1;
                    System.out.println("wrong code...\ntry again...\nremaining try :" + denemeHakki);
                }
            }
        }return false;
    }

    public static void verificationMain(String to, String name) throws MessagingException {
        if (Verifaction(name, to))
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static int Random(){
        Random random = new Random();
        int random1 = random.nextInt(444444);
        return random1+444444;
    }
}
