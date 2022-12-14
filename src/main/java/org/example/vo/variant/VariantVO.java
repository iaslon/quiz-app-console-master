package org.example.vo.variant;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.domains.auth.AuthUser;
import org.example.enums.QuestionStatus;
import org.example.vo.GenericVO;
import org.example.vo.question.QuestionVO;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
@Getter
@Setter
public class VariantVO extends GenericVO {
    private AuthUser user;
    private QuestionStatus status;
    private List<QuestionVO> questionVOS;
    private Integer numberOfRightAnswers;
    private Timestamp createdAt;

    @Builder(builderMethodName = "childBuilder")
    public VariantVO(Long id, AuthUser user, QuestionStatus status, List<QuestionVO> questionVOS, Integer numberOfRightAnswers, Timestamp createdAt) {
        super(id);
        this.user = user;
        this.status = status;
        this.questionVOS = questionVOS;
        this.numberOfRightAnswers = numberOfRightAnswers;
        this.createdAt = createdAt;
    }
}
