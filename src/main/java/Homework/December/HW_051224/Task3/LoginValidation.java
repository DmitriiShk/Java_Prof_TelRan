package Homework.December.HW_051224.Task3;

public class LoginValidation {

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {
        try {
            if (login == null || !login.matches("[a-zA-Z]{3,20}")) {
                throw new WrongLoginException("Login must contain only Latin letters and be 3 to 20 characters long.");
            }

            if (password == null || !password.matches("[a-zA-Z0-9]{5,20}")) {
                throw new WrongPasswordException("Password must contain only digits and Latin letters and be 5 to 20 characters long.");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password and confirmPassword do not match.");
            }
            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Validation error: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(checkLoginAndPassword("john", "1234a", "1234a")); // true
        System.out.println(checkLoginAndPassword("john", "12345", "123456")); // false
        System.out.println(checkLoginAndPassword("john", "12345@", "12345@")); // false
        System.out.println(checkLoginAndPassword("john1", "12345", "12345")); // false
    }

}
