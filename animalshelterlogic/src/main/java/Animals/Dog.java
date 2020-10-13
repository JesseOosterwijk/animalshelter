package Animals;

import Logic.WebShop;

import java.util.Date;

public class Dog extends Animal {
    private Date LastWalk;

    public Dog(String name, Gender gender) {
        super(name, gender);
        this.LastWalk = new Date();
        this.setPrice(getPrice());
    }

    public double getPrice() {
        double standardPrice = 500;
        double calculatedPrice = standardPrice - WebShop.dogAmount * 50;
        if(calculatedPrice < 50) {
            calculatedPrice = 50;
        }
        return calculatedPrice;
    }

    public Date getLastWalk() {
        return LastWalk;
    }

    public boolean NeedsWalk() {
        return ((new Date().getTime() - LastWalk.getTime()) / (1000 * 60 * 60 * 24) % 365) > 0;
    }

    @Override
    public String ToString() {
        return super.ToString() + ", last walk: " + this.LastWalk;
    }
}
