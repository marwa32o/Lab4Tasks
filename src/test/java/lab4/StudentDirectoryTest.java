/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lab4;

import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class StudentDirectoryTest {

    private StudentDirectory directory;

    @BeforeEach
    public void setUp() {
        directory = new StudentDirectory();
        directory.addStudent(101, "Alice");
        directory.addStudent(102, "Bob");
    }

    @Test
    public void testGetAllIDsContent() {
        Set<Integer> ids = directory.getAllIDs();
        assertEquals(2, ids.size(), "Directory size should be 2");
        assertTrue(ids.contains(101), "Directory should contain ID 101");
        assertTrue(ids.contains(102), "Directory should contain ID 102");
    }

    @Test
    public void testGetAllIDsIsUnmodifiable() {
        Set<Integer> ids = directory.getAllIDs();
        
        // Verifies that attempting to modify the set throws UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            ids.add(103);
        }, "Adding an element to getAllIDs() must throw UnsupportedOperationException");
    }
}