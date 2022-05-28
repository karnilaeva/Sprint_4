import java.util.Arrays;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() < 3) {
            return false;
        }
        if (name.length() > 19) {
            return false;
        }
        long countOfSpaces = Arrays.stream(name.split(""))
                .filter(symbol -> symbol.equals(" "))
                .count();
        long countOfTrimmedSpaces = Arrays.stream(name.trim().split(""))
                .filter(symbol -> symbol.equals(" "))
                .count();
        if (countOfSpaces != 1 || countOfTrimmedSpaces != 1) {
            return false;
        }
        return true;
    }

}