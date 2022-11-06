package org.example.vo.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.vo.BaseVO;

/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthCreateVO implements BaseVO {

    private String username;
    private String password;
    private String email;
}
