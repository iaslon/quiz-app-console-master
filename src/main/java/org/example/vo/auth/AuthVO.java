package org.example.vo.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.enums.AuthRole;
import org.example.enums.Status;
import org.example.vo.GenericVO;

import java.time.LocalDateTime;

/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
@Getter
@Setter
@ToString

public class AuthVO extends GenericVO {

    private String username;
    private String email;
    private AuthRole role;
    private LocalDateTime createdAt;

    @Builder(builderMethodName = "childBuilder")
    public AuthVO(Long id, String username, String email, AuthRole role, LocalDateTime createdAt) {
        super(id);
        this.username = username;
        this.email = email;
        this.role = role;
        this.createdAt = createdAt;
    }
}
