/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lab4;

import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentDirectoryTest {

    @Test
    public void testAddStudentAndGetAllIDs() {
        StudentDirectory dir = new StudentDirectory();
        dir.addStudent(101, "Alice");
        dir.addStudent(102, "Bob");

        Set<Integer> ids = dir.getAllIDs();
        
        assertEquals(2, ids.size());
        assertTrue(ids.contains(101));
        assertTrue(ids.contains(102));
    }

    @Test
    public void testGetAllIDsIsUnmodifiable() {
        StudentDirectory dir = new StudentDirectory();
        dir.addStudent(101, "Alice");

        Set<Integer> ids = dir.getAllIDs();

        // Attempting to modify the returned set must throw UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            ids.add(999);
        });
    }
}