/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.*;

public class CourseManager {
    public static void main(String[] args) {
        // Initial list specified in Lab Task 2
        List<String> subjects = new ArrayList<>(Arrays.asList("6.045", "6.005", "8.03", "6.813", "14.03"));

        System.out.println("Initial Subjects: " + subjects);

        // Safe removal using Iterator to avoid ConcurrentModificationException
        Iterator<String> iter = subjects.iterator();
        while (iter.hasNext()) {
            String subject = iter.next();
            if (subject.startsWith("6.")) {
                iter.remove(); // Safely removes element during iteration
            }
        }

        System.out.println("Filtered Subjects: " + subjects);
    }
}
