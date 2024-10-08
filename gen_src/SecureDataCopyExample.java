public class SecureDataCopyExample {

    static class Credentials {
        String username;
        String password;

        Credentials(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public Credentials(Credentials original) {
            this.username = original.username;
            this.password = original.password;
        }
    }

    public static Credentials[] shallowCopy(Credentials[] original) {
        return original.clone();
    }

    public static Credentials[] deepCopy(Credentials[] original) {
        // Method to perform deep copy
    }

    public static void main(String[] args) {
        // Main method
    }
}