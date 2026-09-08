/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

// Final class prevents subclassing and inheritance overrides
public final class Point {

    // Final fields ensure values cannot be modified after construction
    private final int x;
    private final int y;

    // Constructor initializing final fields
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters only (no setter methods)
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }}