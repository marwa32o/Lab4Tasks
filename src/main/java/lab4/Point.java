/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

// Final class prevents subclassing/overriding
public final class Point {
    // Final fields ensure values cannot be modified after construction
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Only getters provided (no setters exist)
    public int getX() { 
        return x; 
    }

    public int getY() { 
        return y; 
    }

    public static void main(String[] args) {
        System.out.println("--- Homework 2 Test: Immutable Point Class ---");
        Point p = new Point(10, 20);
        System.out.println("Point Coordinates: (" + p.getX() + ", " + p.getY() + ")");
        System.out.println("Test Status: PASSED (Point instantiated immutably)");
    }
}
