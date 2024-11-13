package task3_b;

class Engine {
    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}

class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car {
    private String model;
    private Engine engine;
    private Passenger passenger1;
    private Passenger passenger2;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void addPassenger(Passenger passenger) {
        if (passenger1 == null) {
            passenger1 = passenger;
        } else if (passenger2 == null) {
            passenger2 = passenger;
        } else {
            System.out.println("Мест нет");
        }
    }

    public void removePassenger(Passenger passenger) {
        if (passenger1 != null && passenger1.getName().equals(passenger.getName())) {
            passenger1 = null;
        } else if (passenger2 != null && passenger2.getName().equals(passenger.getName())) {
            passenger2 = null;
        }
    }

    public void displayInfo() {
        System.out.println("Автомобиль: " + model + ", Мощность двигателя: " + engine.getPower() + " л.с.");
        System.out.println("Пассажир 1: " + (passenger1 != null ? passenger1.getName() : "Нет"));
        System.out.println("Пассажир 2: " + (passenger2 != null ? passenger2.getName() : "Нет"));
    }

    public static void main(String[] args) {
        Engine engine = new Engine(150);
        Car car = new Car("Toyota", engine);

        Passenger p1 = new Passenger("Анна");
        Passenger p2 = new Passenger("Иван");

        car.addPassenger(p1);
        car.addPassenger(p2);
        car.displayInfo();

        car.removePassenger(p1);
        car.displayInfo();
    }
}
