// Vehicle class 
class Vehicle {
    String make;
    String model;

    // Constructor to initialize make and model
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter method 
    public String getMake() {
        return make;
    }

    // Getter method 
    public String getModel() {
        return model;
    }

    // toString method 
    public String toString() {
        return "Make: " + make + ", Model: " + model;
    }
}

// Speed class 
class Speed {
    int maxSpeed;

    // Constructor 
    public Speed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Getter method 
    public int getMaxSpeed() {
        return maxSpeed;
    }

    // toString method 
    public String toString() {
        return "Max Speed: " + maxSpeed + " km/h";
    }
}

// Van class extends Vehicle 
class Van extends Vehicle {
    Speed speed;

    // Constructor 
    public Van(String make, String model, Speed speed) {
        super(make, model);
        this.speed = speed;
    }

    // toString method 
    public String toString() {
        return super.toString() + ", " + speed.toString();
    }
}

// Main class 
public class Main {
    public static void main(String[] args) {
        // Creating a Speed object 
        Speed speed = new Speed(120);

        // Creating a Van object 
        Van van = new Van("Toyota", "Hiace", speed);

        // Printing 
        System.out.println(van);
    }
}
