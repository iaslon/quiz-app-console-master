package org.example.enums;

import jakarta.persistence.AttributeConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

/**
 * @author "Khazratov Aslonbek"
 * @since 10/07/2022 17:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */

@Getter
@AllArgsConstructor
public enum Status {

    BLOCKED, PASSWORD_NOT_RESET, ACTIVE;

    public static class StatusConvertor implements AttributeConverter<Status, String>{

        @Override
        public String convertToDatabaseColumn(Status status) {

            if (Objects.isNull(status))
                return null;
            return switch (status){
                case ACTIVE ->"Active User";
                case PASSWORD_NOT_RESET -> "User have not reset password";
                case BLOCKED -> "User block for some reason";
            };

        }

        @Override
        public Status convertToEntityAttribute(String dbData) {

            if (Objects.isNull(dbData))
                return null;
            return switch (dbData){
                case "Active User" -> ACTIVE;
                case "User have not reset password" -> PASSWORD_NOT_RESET;
                case "User block for some reason" -> BLOCKED;
                default -> BLOCKED;
            };

        }
    }

}
