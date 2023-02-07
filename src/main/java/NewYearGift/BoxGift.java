package NewYearGift;

public class BoxGift {
    public static void main(String[] args) {
    Cookies Cookies1 = new Cookies("Maria",500,129.99,"Galetnoe");
    Chocolate Chocolate1 = new Chocolate("Alenka", 150,89.99,"Plite Big");
    Chocolate Chocolate2 = new Chocolate();
    Chocolate2.setSize("Small Baton");
    Chocolate2.setName("Snickers");
    Chocolate2.setPrice(55.79);
    Chocolate2.setWeight(99);
    Candies Candies1 = new Candies("Mishka na Severe", 1000,654.23, "Netto");

        System.out.println("Стоимость подарка: " + (Candies1.getPrice() + Chocolate1.getPrice() + Chocolate2.getPrice() + Cookies1.getPrice()));
        System.out.println("Вес подарка: " + (Candies1.getWeight() + Chocolate1.getWeight() + Chocolate2.getWeight() + Cookies1.getWeight()));

    Staff [] box = {Cookies1, Candies1, Chocolate1, Chocolate2};
    for (Staff nabor : box) {
        System.out.println(nabor.toString()); // не совсем полнял, для в печати из примера используем toString()
    }
    }
}
