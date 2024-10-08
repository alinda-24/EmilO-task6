public class MessageEncryptor {

    public static String encryptMessage(String message, int key) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = (char)(message.charAt(i) + key);
            encrypted.append(c);
        }

        return encrypted.toString();
    }

    public static void main(String[] args) {
        System.out.println("Message: Hello World");
        System.out.println("Encrypted message: " + encryptMessage("Hello World", 3));
    }
}