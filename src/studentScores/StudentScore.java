package studentScores;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentScore {
    static ArrayList<String> student = new ArrayList<>();
    static ArrayList<String> subject = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static double total;
    static double average;
    static int position;

    static String scanner() {
        String info = input.nextLine();
        return info;
    }
    static void scannerInput(){
        System.out.printf("%s%n", "student");
        String student = input.nextLine();



}



}
