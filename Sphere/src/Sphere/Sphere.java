package Sphere;

// We are creating a Sphere class, that will have coordinates of the center and the radius.
// Create default, three-argument (center, r=1) and all-argument constructors, method for
// velocity, method for changing the radius and the possibility to always know how
// many spheres were created up to that point.

public class Sphere {
    // Attributes
    private double xCenter;
    private double yCenter;
    private double zCenter;
    private double radius;

    private static int count = 0;

    // Constructors
    public Sphere(double xCenter, double yCenter, double zCenter) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.zCenter = zCenter;
        this.radius = 1;

        count++;
    }

    public Sphere(double xCenter, double yCenter, double zCenter, double radius) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.zCenter = zCenter;
        this.radius = radius;

        count++;
    }

    public Sphere(){
        xCenter = 0;
        yCenter = 0;
        zCenter = 0;
        radius = 0;

        count++;
    }

    // Getter and Setter methods

    public double getxCenter() {
        return xCenter;
    }

    public double getyCenter() {
        return yCenter;
    }

    public double getzCenter() {
        return zCenter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r){
        radius = r;
    }

    public static int getCounter(){
        return count;
    }

    // Methods
    public double Velocity(){
        return 4*radius*radius*radius*Math.PI/3;
    }

    @Override
    public String toString(){
        return "Sphere (" + xCenter + ", " + yCenter + ", " + zCenter + ", " + radius + ")";
    }
}
