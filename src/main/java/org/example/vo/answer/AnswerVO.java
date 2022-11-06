package org.example.vo.answer;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.enums.AnswerStatus;
import org.example.vo.GenericVO;

/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
@Setter
@Getter

public class AnswerVO extends GenericVO {

    private String body;
    private AnswerStatus status;


    @Builder(builderMethodName = "childBuilder")
    public AnswerVO(Long id, String body, AnswerStatus status) {
        super(id);
        this.body = body;
        this.status = status;
    }

    @Override
    public String toString() {
        return "AnswerVO{" +
                "body='" + body + '\'' +
                ", status=" + status +
                ", id=" + id +
                '}';
    }
}
