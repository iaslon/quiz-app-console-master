package org.example.vo.http;

import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
public class AppErrorVO {
    private Timestamp timestamp;
    private String friendlyMessage;
    private String developerMessage;

    public AppErrorVO(String friendlyMessage, String developerMessage) {
        this.timestamp = Timestamp.valueOf(LocalDateTime.now());
        this.friendlyMessage = friendlyMessage;
        this.developerMessage = developerMessage;
    }

    public AppErrorVO(String friendlyMessage) {
        this(friendlyMessage, friendlyMessage);
    }
}
