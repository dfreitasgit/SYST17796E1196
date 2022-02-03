package javaexercise0302;

import java.lang.Math;
import java.util.Scanner;

/*
 * @author David Freitas
 */
public class JavaExercise0302 {

    /*
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        int[] temperatures = new int[14];
        for(int t = 0; t < 14; t++) {
            temperatures[t] = (int)(Math.random()*101-50);
            System.out.println(temperatures[t]);
        }
        
        System.out.println("The average temperature for this week is: " + calcAvg(temperatures));
    }
    
    public static double calcAvg(int[] temps) {
        double average = 0.0;
        for(int a = 0; a < temps.length; a++) {
            if(temps[a] > -50 && temps[a] < 50)
                average += temps[a];
        }
        
        return average/temps.length;
    }
}