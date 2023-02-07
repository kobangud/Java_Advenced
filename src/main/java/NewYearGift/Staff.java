package NewYearGift;

public abstract class Staff {

    private String name;    // наименование
    private double weight;  // вес
    private double price;   // цена
    public Staff () {}
    public Staff(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name = " + name + ";  weight = " + weight + ";  price = " + price;
    }
}
