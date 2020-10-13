package Animals;

import java.util.Date;

public class Reservor {
    private String Name;
    private Date ReservedAt;

    public Reservor(String name, Date reservedAt) {
        this.Name = name;
        this.ReservedAt = reservedAt;
    }

    public String getName() {
        return Name;
    }

    public Date getReservedAt() {
        return ReservedAt;
    }
}
