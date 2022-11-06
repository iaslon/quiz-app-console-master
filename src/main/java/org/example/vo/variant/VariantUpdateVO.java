package org.example.vo.variant;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.enums.QuestionStatus;
import org.example.vo.BaseVO;
import org.example.vo.GenericVO;

/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */

public class VariantUpdateVO extends GenericVO {
    private String subjectName;

    @Builder(builderMethodName = "childBuilder")
    public VariantUpdateVO(Long id, String subjectName, QuestionStatus level, Integer numberOfQuestions, Long userId) {
        super(id);
        this.subjectName = subjectName;
        this.level = level;
        this.numberOfQuestions = numberOfQuestions;
        this.userId = userId;
    }

    private QuestionStatus level;
    private Integer numberOfQuestions;
    private Long userId;
}
