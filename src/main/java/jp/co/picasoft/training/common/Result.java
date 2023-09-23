package jp.co.picasoft.training.common;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result<T> {

    /**
     * return code
     */
    private int code;

    /**
     * return messages
     */
    private List<String> messages;

    /**
     * return data
     */
    private T data;
}
