package com.backendtiss.tiss.security;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptSecurity {
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public static boolean checkPassword(String password, String hashPassword) {
        return BCrypt.checkpw(password, hashPassword);
    }
}
