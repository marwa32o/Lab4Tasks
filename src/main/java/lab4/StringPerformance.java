/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

public class StringPerformance {

    // Method 1: String concatenation using standard String (s = s + i)
    public static void buildString(int n) {
        long startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + i; // O(n²) copy operation
        }
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("String (+) execution time for n = " + n + ": " + duration + " ms");
    }

    // Method 2: Appending using StringBuilder
    public static void buildStringBuilder(int n) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i); // O(n) in-place modification
        }
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("StringBuilder execution time for n = " + n + ": " + duration + " ms");
    }

    public static void main(String[] args) {
        int n = 10000; // Value specified in Task 1 test requirements
        
        System.out.println("--- Running Task 1 Performance Test ---");
        buildString(n);
        buildStringBuilder(n);
    }
}
