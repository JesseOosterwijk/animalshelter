package Animals;

public class Cat extends Animal {
    private String BadHabits;

    public Cat(String name, Gender gender, String badHabits) {
        super(name, gender);
        this.BadHabits = badHabits;
        setPrice(getPrice(badHabits));
    }

    public double getPrice(String badHabits) {
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

    @Override
    public String ToString() {
        return super.ToString() + ", bad habits: " + this.BadHabits.toLowerCase();
    }
}
