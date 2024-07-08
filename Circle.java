public class Circle {
    //Attribute of the Circle class
    private double radius;

    //Constuctor to inititalize the circle object
    public Circle(double radius) {
        this.radius = radius; //Set the radius attribute
    }

    //Getter method for the radius attribute
    public double getRadius() {
        return radius;
    }

    //Setter method for the radius attribute
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius; //Area formula: 
    }

    //Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        //Print the initial radius of the circle
        System.out.println("Inital Radius: " + circle.getRadius());
        //Calculate and print the area of the circle
        double area = circle.calculateArea();
        System.out.println("Area: " + area);
        //Calculate and print the circumference of the circle
        double circumference = circle.calculateCircumference();
        System.out.println("Circumference: " + circumference);

        //Modify the radius of the circle
        circle.setRadius(7.5);
        //Print the update radius
        System.out.println("Updated Radius: " + circle.getRadius());

        //Recalculate and print the area of the circle with the new radius
        area = circle.calculateArea();
        System.out.println("Updated Area: " + circle.calculateArea());

        //Recalculate and print the circumference of the circle with the new radius
        circumference = circle.calculateCircumference();
        System.out.println("Updated Circumference: " + circumference);
    }
}
