package org.example.vo.subject;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.vo.BaseVO;

import java.sql.Timestamp;

/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
@Builder
@Getter
@Setter
@ToString
public class SubjectCreateVO implements BaseVO {
    private String title;
    private Timestamp createdAt;
    private Long createdBy;
}

