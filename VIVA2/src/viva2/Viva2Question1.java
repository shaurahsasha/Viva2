/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package viva2;

/**
 *
 * @author Shaurah Sasha
 */
public class Viva2Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int[] array = {5, 12, 8, 21, 7, 9};
        int result = complexArrayOperation(array);
        System.out.println("Result: " + result);
    }

    public static int complexArrayOperation(int[] arr) {
        int max = findMax(arr);
        int min = findMin(arr);
        int sumofdifference = calculateSumOfDifference(arr);
        int result = (max * min) - sumofdifference;
        int finalresult = round(result);
        return finalresult;
    }

    public static int findMax(int[] arr) {
        int result = arr[0];
        for (int i = 1; i<arr.length; i++){
            result = Math.max(result, arr[i]);
        }
        return result;
    }

    public static int findMin(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i ++) {
            result = Math.min(result, arr[i]);
        }
        return result; 
    }

    public static int calculateSumOfDifference(int[] arr) {
        int result = 0;
        for (int i = 0; i< arr.length-1; i++){
            result += Math.abs(arr[i+1] - arr[i]);
        }
        return result;
    }  
    

    public static int round(int n) {
        int result;
        result = (int)(Math.round((n / 10.0)) * 10);
        return result;
    }
}
