/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.*;

public class StudentDirectory {
    private final Map<Integer, String> directory = new HashMap<>();

    public void addStudent(int id, String name) {
        directory.put(id, name);
    }

    // Returns an unmodifiable view of the key set
    public Set<Integer> getAllIDs() {
        return Collections.unmodifiableSet(directory.keySet());
    }

    public static void main(String[] args) {
        System.out.println("--- Homework 1 Test: Unmodifiable Key Set ---");
        StudentDirectory dir = new StudentDirectory();
        dir.addStudent(101, "Alice");
        dir.addStudent(102, "Bob");

        Set<Integer> ids = dir.getAllIDs();
        System.out.println("Student IDs: " + ids);

        // Test immutability requirement
        try {
            ids.add(103);
            System.out.println("Test Status: FAILED (Set was modified)");
        } catch (UnsupportedOperationException e) {
            System.out.println("Test Status: PASSED (Caught UnsupportedOperationException)");
        }
    }
}