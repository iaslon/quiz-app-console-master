package org.example.vo.teacher;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.domains.auth.AuthUser;
import org.example.domains.subject.Subject;
import org.example.vo.BaseVO;

import java.util.List;

/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class TeacherCreateVO implements BaseVO {

    private String name;
    private String surname;
    private AuthUser user;
    private List<Subject> subjects;

}
