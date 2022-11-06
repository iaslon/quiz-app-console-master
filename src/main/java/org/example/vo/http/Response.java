package org.example.vo.http;

import lombok.Getter;
import lombok.ToString;
/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */

@Getter
@ToString
public class Response<T> {

    private final T data;
    private Integer status;

    public Response(T data) {
        this.data = data;
    }
    public Response(T data, Integer status) {
        this.data = data;
        this.status = status;
    }

}
