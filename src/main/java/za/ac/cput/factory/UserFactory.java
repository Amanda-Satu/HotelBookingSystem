package za.ac.cput.factory;

import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

import java.util.Set;

public class UserFactory {

    private static final Set<String> ALLOWED_ROLES = Set.of("Guest", "Admin");

    public static User createUser(Long userId, String firstName, String lastName, String email, String password, String phoneNumber, String role) {

        if (userId == null || Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName)
                || Helper.isNullorEmpty(email)
                || Helper.isNullorEmpty(password)
                || Helper.isNullorEmpty(phoneNumber)
                || Helper.isNullorEmpty(role)) {
            throw new IllegalArgumentException("User details must not be null or empty");
        }

        if (!Helper.isValidEmail(email))
            throw new IllegalArgumentException("Invalid email");


//        String upperRole = role.toUpperCase();
//        if (!ALLOWED_ROLES.contains(upperRole)) {
//            throw new IllegalArgumentException("Invalid role: " + role);
//        }

        return new User.Builder()
                .setUserId(userId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .setPhoneNumber(phoneNumber)
                .setRole(role)
                .build();

    }

}//end
