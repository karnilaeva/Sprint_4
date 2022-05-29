public class Praktikum {
    public static void main(String[] args) {
        String name = "Генри Пушнель";
        Account account = new Account(name);
        System.out.println("Результат проверки: " + account.checkNameToEmboss());
    }
}
