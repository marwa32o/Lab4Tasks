/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.*;

public class TreasureMap {
    public static void main(String[] args) {
        // 1. Initialize Map with required key-value pairs
        Map<String, Double> treasures = new HashMap<>();
        treasures.put("beach", 25.0);
        treasures.put("palm", 50.0);
        treasures.put("cove", 75.0);

        System.out.println("Initial Map: " + treasures);

        // 2. Update value of 'palm': current value + map size (size is 3)
        treasures.put("palm", treasures.get("palm") + treasures.size());

        // 3. Iterate through treasures.values() to calculate total sum
        double total = 0.0;
        for (double value : treasures.values()) {
            total += value;
        }

        System.out.println("Updated Map: " + treasures);
        System.out.println("Total Treasures Value: " + total);
    }
}