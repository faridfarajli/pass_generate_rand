package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int a;
    public static void main(String[] args) {
        System.out.println("Random Şifrə Yaratma Tətbiqinə Xoş Gəldiniz");
        System.out.println("Şifrənizin uzunluğunun nə qədər olmasını istəyirsiniz");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if(a<6){
            a=16;
        }
        System.out.println(pass(a));
    }

    public static char[] pass(int len ){
        System.out.println("Sizin Şifrəniz: ");
        String one = "ABCDEFGHIJKLMNOPRSTUVWXYZ";
        String two = "abcdefghijklmnoprstuvwxyz";
        String num= "0123456789";
        String symbol = "!@#$%^&*_=+-/<>?.";
        String sum = one+two+num+symbol;
        Random rnd = new Random();

        char [] password = new char[len];
        for (int i =0;i<len;i++){
            password[i] = sum.charAt(rnd.nextInt(sum.length()));
        }
        return password;
    }
}