package task1_b;

class Octagon {
    private double innerRadius;

    public Octagon(double innerRadius) {
        this.innerRadius = innerRadius;
    }

    public void setInnerRadius(double innerRadius) {
        this.innerRadius = innerRadius;
    }

    public double calculateArea() {
        return 2 * (1 + Math.sqrt(2)) * innerRadius * innerRadius;
    }

    public double calculatePerimeter() {
        return 8 * innerRadius * Math.sqrt(2);
    }

    public static void main(String[] args) {
        Octagon octagon = new Octagon(5);
        System.out.println("Площадь: " + octagon.calculateArea());
        System.out.println("Периметр: " + octagon.calculatePerimeter());
    }
}
