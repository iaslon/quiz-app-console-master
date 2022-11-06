package org.example.vo.student;

import lombok.Getter;
import lombok.Setter;
import org.example.domains.auth.AuthUser;
import org.example.vo.GenericVO;

/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
@Getter
@Setter
public class StudentVO extends GenericVO {

    private String name;
    private String surname;
    private AuthUser user;

    public StudentVO(Long id) {
        super(id);
    }
}
