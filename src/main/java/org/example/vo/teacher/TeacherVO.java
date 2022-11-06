package org.example.vo.teacher;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.vo.GenericVO;
import org.example.vo.subject.SubjectVO;

import java.util.List;

/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */

@Getter
@Setter
@ToString
public class TeacherVO extends GenericVO {

    private String name;
    private String surname;
    private List<SubjectVO> subjectVOList;

    @Builder
    public TeacherVO(Long id, String name, String surname, List<SubjectVO> subjectVOList) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.subjectVOList = subjectVOList;
    }
}
