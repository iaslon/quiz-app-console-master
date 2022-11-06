package org.example.configs;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;


/**
 * @author "Khazratov Aslonbek"
 * @since 10/07/2022 21:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
@NoArgsConstructor(access = AccessLevel.MODULE)
public class PasswordConfigurer {

    public static String encode(String rawPassword) {
        return BCrypt.hashpw(rawPassword, BCrypt.gensalt(12));
    }

    public static boolean matchPassword(String rawPassword, String encodedPassword) {
        return BCrypt.checkpw(rawPassword, encodedPassword);
    }
}
