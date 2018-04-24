package Sphere;

public class TestSphere {

    public static void main(String[] args) {
        System.out.println("Number of spheres: " + Sphere.getCounter());
        Sphere sphere = new Sphere(0, 0, 0, 4);
        System.out.println(sphere + " has a velocity of " + sphere.Velocity());

        System.out.println("Number of spheres: " + Sphere.getCounter());
        Sphere sphere2 = new Sphere(1, 1, 1, 12);
        System.out.println(sphere2 + " has a velocity of " + sphere2.Velocity());

        System.out.println("Number of spheres: " + Sphere.getCounter());
        Sphere sphere3 = new Sphere(0, 1, 0);
        System.out.println(sphere3 + " has a velocity of " + sphere3.Velocity());
    }
}
