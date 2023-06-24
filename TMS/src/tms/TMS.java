/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tms;


import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TMS {
    static Scanner scanner;
    static String p;
    static String r;

    public TMS() {
    }

    public static void main(String[] args) {
        System.out.println("Welcome to My Movie Booker!\n");
        MainMenu.mainmenu();
    }

    static {
        scanner = new Scanner(System.in);
    }
}
