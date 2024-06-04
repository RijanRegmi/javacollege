public class Encapsulation {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setName("Apple M1");
        System.out.println(laptop.getName());
        laptop.setBrand("Apple");
        System.out.println(laptop.getBrand());
        laptop.setPrice(120000);
        System.out.println(laptop.getPrice());
        laptop.setYear(2024);
        System.out.println(laptop.getYear());

    }
}

class Laptop {
    private String name;
    private String brand;
    private double price;
    private int year;

    // make read-only acess using getter
    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    // make write-only access using setter
    public void setName(String name) {
        this.name = name;
    }
    // Task
    // Name getter and setter for all attributes
    // Make 2 object of laptop
    // Output:
    // name: Apple M1
    // Brand: Apple
    // Price: 100000
    // Year: 2023

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
