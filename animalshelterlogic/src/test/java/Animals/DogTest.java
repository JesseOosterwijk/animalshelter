package Animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DogTest {
    private Dog dog;

    @BeforeEach
    void SetUp() {
        this.dog = new Dog("Sgt. Woof", Gender.Male);
    }

    @Test
    void TestConstructor() {
        assertEquals("Sgt. Woof", this.dog.getName());
        assertEquals(Gender.Male, this.dog.getGender());
        assertNull(this.dog.getReservedBy());
        assertEquals(new Date(), this.dog.getLastWalk());
        assertFalse(this.dog.NeedsWalk());
    }

    @Test
    void TestReservation() {
        assertNull(this.dog.getReservedBy());
        assertTrue(this.dog.Reserve("John Doe"));
        assertNotNull(this.dog.getReservedBy());
        assertEquals("John Doe", this.dog.getReservedBy().getName());
        assertFalse(this.dog.Reserve("Jane Doe"));
    }

    @Test
    void TestReservationTime()
    {
    }
}
