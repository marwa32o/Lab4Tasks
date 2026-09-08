/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentDirectory {

    private final Map<Integer, String> directory = new HashMap<>();

    public void addStudent(int id, String name) {
        directory.put(id, name);
    }

    // Returns an unmodifiable view of the key set
    public Set<Integer> getAllIDs() {
        return Collections.unmodifiableSet(directory.keySet());
    }
}