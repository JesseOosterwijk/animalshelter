package Animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CatTest {
    private Cat cat;

    @BeforeEach
    void SetUp() {
        this.cat = new Cat("Ms. Meow", Gender.Female, "Scratches couch");
    }

    @Test
    void TestConstructor() {
        assertEquals("Ms. Meow", this.cat.getName());
        assertEquals(Gender.Female, this.cat.getGender());
        assertNull(this.cat.getReservedBy());
        assertEquals("Scratches couch", this.cat.getBadHabits());
    }

    @Test
    void TestReservation() {
        assertNull(this.cat.getReservedBy());
        assertTrue(this.cat.Reserve("John Doe"));
        assertNotNull(this.cat.getReservedBy());
        assertEquals("John Doe", this.cat.getReservedBy().getName());
        assertFalse(this.cat.Reserve("Jane Doe"));
    }

    @Test
    void TestReservationTime()
    {
    }
}
