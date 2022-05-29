import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountTest {

    @Test
    public void nameLength() {
        assertTrue(new Account("A C").checkNameToEmboss());
        assertTrue(new Account("123456789 123456789").checkNameToEmboss());
        assertTrue(new Account("A Cп").checkNameToEmboss());
        assertTrue(new Account("123456789 12345678").checkNameToEmboss());
        assertTrue(new Account("Супер Юля").checkNameToEmboss());
        assertFalse(new Account("ГП").checkNameToEmboss());
        assertFalse(new Account("123456789 1234567891").checkNameToEmboss());
        assertFalse(new Account("123456789 12345678919807342590872439085723409570").checkNameToEmboss());
        assertFalse(new Account("").checkNameToEmboss());
    }

    @Test
    public void onlyOneSpace() {
        assertTrue(new Account("Генри Пушнель").checkNameToEmboss());
        assertFalse(new Account(" ГенриПушнель").checkNameToEmboss());
        assertFalse(new Account(" Генри Пушнель").checkNameToEmboss());
        assertFalse(new Account("ГенриПушнель ").checkNameToEmboss());
        assertFalse(new Account("Генри Пуш нель").checkNameToEmboss());
        assertFalse(new Account("ГенриПушнель").checkNameToEmboss());
    }

    @Test
    public void nullParameter() {
        assertFalse(new Account(null).checkNameToEmboss());
    }
}