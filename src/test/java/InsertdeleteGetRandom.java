import org.example.ArrayOrString.RandomizedSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InsertdeleteGetRandom {
    @Test
    public void test(){
        RandomizedSet randomizedSet = new RandomizedSet();
        boolean result1 = randomizedSet.insert(1);
        assertTrue(result1, "insert(1) should return true");

        boolean result2 = randomizedSet.remove(2);
        assertFalse(result2, "remove(2) should return false as 2 is not in the set");

        boolean result3 = randomizedSet.insert(2);
        assertTrue(result3, "insert(2) should return true");
        
        int random1 = randomizedSet.getRandom();
        assertTrue(random1==1|| random1==2, "getRandom() should return either 1 or 2, got: " + random1);

        boolean result4 = randomizedSet.remove(1);
        assertTrue(result4, "remove(1) should return true");

        // Operation 7: insert(2) - Expected: false (2 already exists)
        boolean result5 = randomizedSet.insert(2);
        assertFalse(result5, "insert(2) should return false as 2 is already in the set");

        // Operation 8: getRandom() - Expected: 2 (only element left)
        int random2 = randomizedSet.getRandom();
        assertEquals(2, random2, "getRandom() should return 2 as it's the only element");

        // Verify final state
        assertFalse(randomizedSet.search(1), "Element 1 should not be in the set");
        assertTrue(randomizedSet.search(2), "Element 2 should be in the set");
        
    }
}
