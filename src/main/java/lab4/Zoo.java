/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.*;

public class Zoo {
    // Mutable list containing initial animals
    private final List<String> animals = new ArrayList<>(Arrays.asList("lion", "tiger", "bear"));

    // Returns an unmodifiable wrapper around the list
    public List<String> getAnimals() {
        return Collections.unmodifiableList(animals);
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        List<String> readOnlyAnimals = zoo.getAnimals();

        System.out.println("Initial Animals: " + readOnlyAnimals);

        // Attempting to modify the read-only list to trigger and catch exception
        try {
            readOnlyAnimals.add("flamingo");
        } catch (UnsupportedOperationException e) {
            System.out.println("Success: Caught UnsupportedOperationException! List is unmodifiable.");
        }
    }
}