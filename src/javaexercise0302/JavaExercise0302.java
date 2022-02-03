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
        
        //Initialized temperature array for the week
        int[] temperatures = new int[14];
        
        //Creates random temperatures for the week 2 * 7 days
        for(int t = 0; t < 14; t++) {
            temperatures[t] = (int)(Math.random()*101-50);
            System.out.println(temperatures[t]);
        }
        
        System.out.println("The average temperature for this week is: " + calcAvg(temperatures));
        System.out.println("The maximum temperature for this week is: " + calcMax(temperatures));
    }
    
    //Calculates average
    public static double calcAvg(int[] temps) {
        double average = 0.0;
        for(int a = 0; a < temps.length; a++) {
            
            //Excludes Temperatures from outside of range
            if(temps[a] > -50 && temps[a] < 50)
                average += temps[a];
        }
        
        //Calculates and returns the average
        return average/temps.length;
    }
    
    //Calculates the maximum temperature of the array of temps
    public static int calcMax(int[] temps) {
        int maxTemp = 0;
        for(int m = 0; m < temps.length; m++) {
            if(temps[m] > maxTemp)
                maxTemp = temps[m];
        }
        return maxTemp;
    }
}
