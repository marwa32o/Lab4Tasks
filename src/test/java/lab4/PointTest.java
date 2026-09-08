/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    public void testPointInitializationAndGetters() {
        Point p = new Point(10, 20);

        assertEquals(10, p.getX());
        assertEquals(20, p.getY());
    }
@Test
    public void testPointImmutability() {
        Point p = new Point(5, 15);

        // Verifies coordinates remain constant across multiple calls
        assertEquals(5, p.getX());
        assertEquals(15, p.getY());
        assertEquals(5, p.getX());
    }}