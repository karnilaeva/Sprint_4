import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountLengthTest {

    private final String name;
    private final boolean expectedResult;

    public AccountLengthTest(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static Object[][] getParameters() {
        return new Object[][]{
                {"A C", true},
                {"123456789 123456789", true},
                {"A Cп", true},
                {"123456789 12345678", true},
                {"Супер Юля", true},
                {"ГП", false},
                {"123456789 1234567891", false},
                {"123456789 12345678919807342590872439085723409570", false},
                {"", false},
        };
    }

    @Test
    public void lengthTest() {
        assertEquals(name, new Account(name).checkNameToEmboss(), expectedResult);
    }
}
