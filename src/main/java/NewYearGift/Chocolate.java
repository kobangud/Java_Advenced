package NewYearGift;

public class Chocolate extends Staff{                                           //шоколад
    private String size;                                                        // размер плитки/батончик -  маленькая/ большая)
    public Chocolate() {}
    public Chocolate(String name, double weight, double price, String size) {
        super(name, weight, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Chocolate (" + super.toString() + ";  size = " + size + ")";
    }
}
