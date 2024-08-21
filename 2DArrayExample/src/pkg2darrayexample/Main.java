/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2darrayexample;
import java.util.*;
/**
 *
 * @author s539941
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] [] arr = new int[4] [4];
        
        int [] [] numbers = {{1,2,3}, {2,7,9}, {3,8,11}, {4,5,6}};
        printByRows(numbers);
        System.out.println{"Column Array"};
        printByCols(numbers);
        
        
        String [] [] students = {{"Bob", "3.56"}, {"Sue", "2.78"}, {"Jill", "4.0"}};
        double avg = Double.partDouble(students[0][1]) + Double.parseDouble(students[1][1])
                +Double.parseDouble(student[2][1])) / 3;
        System.out.println(avg);
        }
    
    
        public static void printByRows(int[][] arr){
            for(int row = 0; row < arr[row].length; row ++){
                for(int col = 0; col < arr[row].length; col ++){
                    System.out.print(arr[row][col] + " ");
                }
            System.out.println();
            }
        }
        public static void printByCols(int[][] arr){
            for(int col = 0; col < arr[0].length; col ++){
                for(int row = 0; row<arr.length; row ++){
                    System.out.print(arr[row][col] + " ");
                }
                System.out.println();
            }
        }
                
    }
    
}
