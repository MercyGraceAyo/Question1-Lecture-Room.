/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.lectureroommanager;

/**
 *
 * @author CARGOWELL
 */
import java.util.Scanner;
public class EasyReader {
    private Scanner scanner;

    public EasyReader() {
        this.scanner = new Scanner(System.in);
    }

    public int readInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // clear invalid input
        }
        return scanner.nextInt();
    }

    public String readString(String prompt) {
        System.out.print(prompt);
        return scanner.next().trim().toUpperCase();
}
}