package org.example.vo.variant;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.enums.QuestionStatus;
import org.example.vo.BaseVO;

/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
@Builder
@Getter
@Setter
public class VariantCreateVO implements BaseVO {
    private String subjectName;
    private QuestionStatus status;
    private Integer numberOfQuestions;
    private Long userId;

}
