package Animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

public class AnimalTest {
    private Animal animal;

    @BeforeEach
    void SetUp() {
        this.animal = new Dog("Ugly Duckling", Gender.Male);
    }

    @Test
    void TestConstructor() {
        Assertions.assertEquals("Ugly Duckling", this.animal.getName());
        Assertions.assertEquals(Gender.Male, this.animal.getGender());
        assertNull(this.animal.getReservedBy());
    }

    @Test
    void TestReservation() {
        assertNull(this.animal.getReservedBy());
        Assertions.assertTrue(this.animal.Reserve("John Doe"));
        assertNotNull(this.animal.getReservedBy());
        Assertions.assertEquals("John Doe", this.animal.getReservedBy().getName());
        Assertions.assertFalse(this.animal.Reserve("Jane Doe"));
    }


    @Test
    void TestReservationTime() {
        ;
    }
}
