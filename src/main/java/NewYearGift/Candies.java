package NewYearGift;

public class Candies extends Staff{
    private String typeBox;
    public Candies(String name, double weight, double price,String typeBox) {
        super(name, weight, price);
        this.typeBox = typeBox;
    }

    public String getTypeBox() {
        return typeBox;
    }

    public void setTypeBox(String typeBox) {
        this.typeBox = typeBox;
    }

    @Override
    public String toString() {
        return "Candies (" + super.toString() + ";  typeBox = " + typeBox + ")";
    }
}
