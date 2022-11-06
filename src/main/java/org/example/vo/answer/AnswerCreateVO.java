package org.example.vo.answer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.AnswerStatus;
import org.example.vo.BaseVO;
/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AnswerCreateVO implements BaseVO {

    private String body;
    private AnswerStatus status;
}
