import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class AccountTest {

    @Test
    public void nullParameter() {
        assertFalse(new Account(null).checkNameToEmboss());
    }
}