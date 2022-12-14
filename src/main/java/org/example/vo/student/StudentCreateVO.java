package org.example.vo.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.domains.auth.AuthUser;
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
public class StudentCreateVO implements BaseVO {

    private String name;
    private String surname;
    private AuthUser user;

}
