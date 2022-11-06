package org.example.vo.question;

import lombok.*;
import org.example.enums.QuestionStatus;
import org.example.vo.BaseVO;
import org.example.vo.answer.AnswerCreateVO;

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
public class QuestionCreateVO implements BaseVO {


    private String body;
    private QuestionStatus status;
    private List<AnswerCreateVO> answerCreateVOList;
    private String subjectName;
    private Long createdBy;


}
