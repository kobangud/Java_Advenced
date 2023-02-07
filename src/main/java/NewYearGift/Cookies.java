package NewYearGift;

public class Cookies extends Staff {                                        //  печенье
    private String type;                                                    // тип (заварное, песочное)
    public Cookies(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cookies (" + super.toString() + ";  type = " + type + ")";
    }
}


