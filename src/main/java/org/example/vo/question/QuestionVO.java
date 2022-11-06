package org.example.vo.question;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.enums.QuestionStatus;
import org.example.vo.BaseVO;
import org.example.vo.GenericVO;
import org.example.vo.answer.AnswerVO;
import org.example.vo.subject.SubjectVO;

import java.util.List;

/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
@Getter
@Setter
public class QuestionVO extends GenericVO {

    private String body;
    private QuestionStatus status;
    private List<AnswerVO> answerVOList;
    private SubjectVO subjectVO;

    @Builder(builderMethodName = "childBuilder")
    public QuestionVO(Long id, String body, QuestionStatus status, List<AnswerVO> answerVOList, SubjectVO subjectVO) {
        super(id);
        this.body = body;
        this.status = status;
        this.answerVOList = answerVOList;
        this.subjectVO = subjectVO;
    }
}
