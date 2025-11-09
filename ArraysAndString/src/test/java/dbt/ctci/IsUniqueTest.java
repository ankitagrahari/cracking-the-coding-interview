package dbt.ctci;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

class IsUniqueTest {

    @Test
    public void isUnique() {
        String input = "Subdermatoglyphic";
        Assert.assertFalse(IsUnique.isUnique(input));
    }
}