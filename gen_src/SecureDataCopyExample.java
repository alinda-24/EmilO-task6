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
        Credentials[] copy = new Credentials[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = new Credentials(original[i]);
        }

        return copy;
    }

    public static void printOutArray(Credentials[] array){
        for (Credentials credentials : array) {
            System.out.println(credentials.username + ", " + credentials.password);
        }
    }

    public static void main(String[] args) {
        Credentials[] originalArray = {
            new Credentials("user1", "pass1"),
            new Credentials("user2", "pass2"),
            new Credentials("user3", "pass3")
        };

        Credentials[] shallowCopyArray = shallowCopy(originalArray);

        Credentials[] deepCopyArray = deepCopy(originalArray);

        shallowCopyArray[0].password = "newShallowPass";  // This will also affect the original
        deepCopyArray[1].password = "newDeepPass";        // This will not affect the original

        System.out.println("Original Array:");
        printOutArray(originalArray);

        System.out.println("\nShallow Copy Array:");
        printOutArray(shallowCopyArray);

        System.out.println("\nDeep Copy Array:");
        printOutArray(deepCopyArray);
    }
}