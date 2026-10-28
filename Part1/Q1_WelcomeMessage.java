public class Q1_WelcomeMessage {
    public static void main(String[] args) {
        String name = "Alice";
        String city = "Melbourne";

        StringBuffer message = new StringBuffer("Welcome, ");
        message.append(name);
        message.append("! We hope you're enjoying your time in ").append(city).append(".");

        System.out.println(message);
    }
}