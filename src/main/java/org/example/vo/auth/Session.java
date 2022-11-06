package org.example.vo.auth;

import lombok.Getter;
import lombok.Setter;
import org.example.enums.AuthRole;

import java.util.Objects;
/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
public class Session {

    public static SessionUser sessionUser;

    public static void setSessionUser(AuthVO authVO){

        if (Objects.isNull(authVO))
            sessionUser = null;
        else sessionUser = new SessionUser(authVO);
    }

    @Getter
    @Setter
    public static class SessionUser {

        private Long id;
        private String username;
        private AuthRole role;

        public SessionUser(AuthVO session) {
            this.id = session.id;
            this.username = session.getUsername();
            this.role = session.getRole();
        }
    }
}
