import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnimalShelterTest {
    AnimalShelter as;
    
    @Before
    public void setUp() {
        as = new AnimalShelter();
    }

    @Test
    public void test() {
        final Animal FIRST = Animal.CAT;
        final Animal SECOND = Animal.DOG;
        as.enqueue(FIRST);
        as.enqueue(SECOND);
        as.enqueue(Animal.DOG);
        as.enqueue(Animal.CAT);
        as.enqueue(Animal.CAT);
        as.enqueue(Animal.DOG);
        assertEquals(FIRST, as.dequeueAny());
        assertEquals(SECOND, as.dequeueAny());
        assertEquals(Animal.CAT, as.dequeueCat());
        assertEquals(Animal.DOG, as.dequeueDog());
    }

}
