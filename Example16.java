interface Vehicle {
    void startRide();
    void endRide();
    float calculateFare(int dist);
}

interface PricingStrategy {
    float getMultiplier(int dist);
}

class Auto implements PricingStrategy, Vehicle {
    public void startRide() {
        System.out.println("Starting Auto");
    }

    public void endRide() {
        System.out.println("Stopping Auto");
    }

    public float calculateFare(int dist) {
        return getMultiplier(dist) * dist;
    }

    public float getMultiplier(int dist) {
        return (isPeakHours() || isHoliday()) ? 2.5f : 2.0f;
    }

    private boolean isPeakHours() {
        // Simulating peak hours. You can replace this with actual time-based checks.
        return true;  // Assuming it's peak hour for simplicity
    }

    private boolean isHoliday() {
        // Simulating holiday. You can replace this with actual holiday checking logic.
        return false;  // Assuming it's not a holiday for simplicity
    }
}

class Bus implements PricingStrategy, Vehicle {
    public void startRide() {
        System.out.println("Starting Bus");
    }

    public void endRide() {
        System.out.println("Stopping Bus");
    }

    public float calculateFare(int dist) {
        return getMultiplier(dist) * dist;
    }

    public float getMultiplier(int dist) {
        return (isPeakHours() || isHoliday()) ? 1.5f : 0.5f;
    }

    private boolean isPeakHours() {
        // Simulating peak hours.
        return false;
    }

    private boolean isHoliday() {
        // Simulating holiday.
        return false;
    }
}

class Cab implements PricingStrategy, Vehicle {
    public void startRide() {
        System.out.println("Starting Cab");
    }

    public void endRide() {
        System.out.println("Stopping Cab");
    }

    public float calculateFare(int dist) {
        return getMultiplier(dist) * dist;
    }

    public float getMultiplier(int dist) {
        return (isPeakHours() || isHoliday()) ? 3.0f : 4.0f;
    }

    private boolean isPeakHours() {
        // Simulating peak hours.
        return false;
    }

    private boolean isHoliday() {
        // Simulating holiday.
        return false;
    }
}

public class Example16 {
    public static void main(String[] args) {
        // Create instances of each vehicle
        Vehicle auto = new Auto();
        Vehicle bus = new Bus();
        Vehicle cab = new Cab();

        // Simulate a ride for each vehicle
        int distance = 10; // distance for fare calculation

        // Testing Auto
        System.out.println("Auto Fare for " + distance + " km: " + auto.calculateFare(distance));
        auto.startRide();
        auto.endRide();

        // Testing Bus
        System.out.println("Bus Fare for " + distance + " km: " + bus.calculateFare(distance));
        bus.startRide();
        bus.endRide();

        // Testing Cab
        System.out.println("Cab Fare for " + distance + " km: " + cab.calculateFare(distance));
        cab.startRide();
        cab.endRide();
    }
}
