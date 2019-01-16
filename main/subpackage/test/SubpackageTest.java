package grakn.template.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SubpackageTest {
    @Test
    public void subpackageTest() {
        Subpackage subpackage = new Subpackage();
        assertEquals(subpackage.name(), "Subpackage");
    }
}