/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package engineeringjava;

/**
 *
 * @author GUERRA_CPE113
 */
public class EngineeringJava {
   
    private double x;
    private double y;

    public EngineeringJava(double x, double y) {
        this.x = x;
        this.y = y;
        
    }public void setX(double x) {
        this.x = x;
        
    } public void setY(double y) {
        this.y = y;
        
    }public double getX() {
        return x;
        
    }public double getY() {
        return y;
        
    }public double calculateDistance(EngineeringJava point) {
        double xDiff = point.getX() - this.x;
        double yDiff = point.getY() - this.y;
        double dist = Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
        return dist;
        
    }public double calculateSlope(EngineeringJava point) {
        double xDiff = point.getX() - this.x;
        double yDiff = point.getY() - this.y;
        if (xDiff == 0) {
        return 0;
        }
        double slope = yDiff / xDiff;
        return slope;
    }
}
