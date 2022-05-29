import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountSpaceTest {

    private final String name;
    private final boolean expectedResult;

    public AccountSpaceTest(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static Object[][] getParameters() {
        return new Object[][]{
                {"Генри Пушнель", true},
                {" ГенриПушнель", false},
                {" Генри Пушнель", false},
                {"ГенриПушнель ", false},
                {"Генри Пуш нель", false},
                {"ГенриПушнель", false},
        };
    }

    @Test
    public void spaceTest() {
        assertEquals(name, new Account(name).checkNameToEmboss(), expectedResult);
    }
}
