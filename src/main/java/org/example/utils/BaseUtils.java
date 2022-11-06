package org.example.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.configs.PasswordConfigurer;

/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BaseUtils {

    private static BaseUtils instance;

    public static BaseUtils getInstance(){
        if (instance==null){
            instance = new BaseUtils();
        }
        return instance;
    }


    public String encode(String rowPassword){
        return PasswordConfigurer.encode(rowPassword);
    }

    public boolean matchPassword(String rowPassowrd, String encodedPassword){
        return PasswordConfigurer.matchPassword(rowPassowrd, encodedPassword);
    }


}
