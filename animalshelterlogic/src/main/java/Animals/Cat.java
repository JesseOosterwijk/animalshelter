package Animals;

public class Cat extends Animal {
    private String BadHabits;

    public Cat(String name, Gender gender, String badHabits) {
        super(name, gender);
        this.BadHabits = badHabits;
        setPrice(calcPrice(badHabits));
    }

    public double calcPrice(String badHabits) {
        double standardPrice = 350;
        int length = badHabits.length();
        double calculatedPrice = standardPrice - 20 * length;
        if(calculatedPrice < 35) {
            calculatedPrice = 35;
        }
        return calculatedPrice;
    }

    public String getBadHabits() {
        return BadHabits;
    }

    public String toString() {
        return super.toString() + ", bad habits: " + this.BadHabits.toLowerCase() + ", price: " + this.getPrice();
    }
}
