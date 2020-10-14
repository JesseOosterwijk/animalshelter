package Animals;

import Interfaces.ISellable;

import java.util.Date;

public abstract class Animal implements ISellable {
    private String Name;
    private Gender Gender;
    private Reservor ReservedBy;
    private double Price;

    public Animal(String name, Gender gender) {
        this.Name = name;
        this.Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public Gender getGender() {
        return Gender;
    }

    public Reservor getReservedBy() {
        return ReservedBy;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public boolean Reserve(String reservedBy) {
        if(this.ReservedBy == null)
        {
            this.ReservedBy = new Reservor(reservedBy, new Date());
            return true;
        }
        return false;
    }

    public String toString() {
        String reserved = "not reserved";
        if(this.ReservedBy != null) {
            reserved = String.format("reserved by %s", this.ReservedBy);
        }
        return this.Name + " " + this.Gender + " " + reserved;
    }
}
