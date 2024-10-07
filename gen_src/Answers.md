## Exercise 1
    1. The Random class belongs to the java util package. It is used to generate pseudo-random values of type integer, float or booleans.
    2. java.util.Random is faster but not as secure as java.security.SecureRandom. Random can be predicted but not SecureRandom. That makes Random more suitable for general applications where security is not needed. SecureRandom is better suitable where security is of importance. It is more resistant to attacks such as brute-forcing or reverse-engineering because of its use of a more advanced cryptographic algorithms.

## Exercise 2
    Ternary Operator is a shorter way to write an if-else-statment.

    ```java
if (userRole.equals("admin")) {
    accessLevel = "full";
} else {
    accessLevel = "restricted";
}
```

This code can be re-writen like this:

```java
acessLevel = userRole.equals("admin") ? "full" : "restricted";
```

If userRole.equals("admin") is true, accessLevel will be set to "full".
If userRole.equals("admin") is false, accessLevel will be set to "restricted".