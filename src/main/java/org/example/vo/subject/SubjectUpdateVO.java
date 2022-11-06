package org.example.vo.subject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.vo.GenericVO;

/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
@Getter
@Setter
@ToString
public class SubjectUpdateVO extends GenericVO {

    private String title;

    public SubjectUpdateVO(Long id, String title) {
        super(id);
        this.title = title;
    }
}
