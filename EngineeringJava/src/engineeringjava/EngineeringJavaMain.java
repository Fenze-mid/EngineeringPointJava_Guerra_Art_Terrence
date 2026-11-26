/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package engineeringjava;

/**
 *
 * @author GUERRA_CPE113
 */
public class EngineeringJavaMain {

    public static void main(String[] args) {
        System.out.println(" ENGINEERING DISTANCE AND SLOPE ANALYZER ");
         System.out.println();

        EngineeringJava pointA = new EngineeringJava(3, 4);
        EngineeringJava pointB = new EngineeringJava(9, 12);

        System.out.printf("Point A: (%.2f, %.2f)%n", pointA.getX(), pointA.getY());
         System.out.printf("Point B: (%.2f, %.2f)%n", pointB.getX(), pointB.getY());
         System.out.println();

        double distAB = pointA.calculateDistance(pointB);
        System.out.printf("Distance: %.2f units%n", distAB);

        if (pointA.getX() == pointB.getX()) {
            System.out.println("Slope:Undefined");
        } else {
            double slopeAB = pointA.calculateSlope(pointB);
            System.out.printf("Slope: %.2f%n", slopeAB);
            
        }EngineeringJava pointC = new EngineeringJava(0, 0);
        pointC.setX(3);
        pointC.setY(10);

        System.out.println();
         System.out.println("Point A to Point C:");
          System.out.printf("Distance: %.2f units%n", pointA.calculateDistance(pointC));

        if (pointA.getX() == pointC.getX()) {
            System.out.println("Slope: Undefined");
        } else {
            System.out.printf("Slope: %.2f%n", pointA.calculateSlope(pointC));
            
        }
        System.out.println();
        System.out.println("Point B to Point C:");
        System.out.printf("Distance: %.2f units%n", pointB.calculateDistance(pointC));

        if (pointB.getX() == pointC.getX()) {
            System.out.println("Slope:Undefined");
        } else {
            System.out.printf("Slope: %.2f%n", pointB.calculateSlope(pointC));
        }
    }
}