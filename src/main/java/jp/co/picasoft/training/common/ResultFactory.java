package jp.co.picasoft.training.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 戻り値生成工場
 */
@Component
public class ResultFactory<T> {

    /**
     * 成功戻りコード
     */
    private static int success;

    /**
     * 成功戻りコードの設定
     * 
     * @param value 成功戻りコード
     */
    @Value("${result.success}")
    public void setSuccess(int value) {
        success = value;
    }

    /**
     * 警告戻りコード
     */
    private static int warning;

    /**
     * 警告戻りコードの設定
     * 
     * @param value 警告戻りコード
     */
    @Value("${result.warning}")
    public void setWarning(int value) {
        warning = value;
    }

    /**
     * 異常戻りコード
     */
    private static int failure;

    /**
     * 異常戻りコードの設定
     * 
     * @param value 異常戻りコード
     */
    @Value("${result.failure}")
    public void setFailure(int value) {
        failure = value;
    }

    /**
     * 成功時、データのみ戻り
     * 
     * @param data 戻りデータ
     * @return 戻り値
     */
    public static <T> Result<T> success(T data) {

        return success(new ArrayList<String>(), data);
    }

    /**
     * 成功時、メッセージとデータ両方戻り
     * 
     * @param messates メッセージ
     * @param data 戻りデータ
     * @return 戻り値
     */
    public static <T> Result<T> success(List<String>messages, T data) {
        return new Result<T>(success, messages, data);
    }

    /**
     * 警告時、メッセージのみ戻り
     * 
     * @param messates メッセージ
     * @return 戻り値
     */
    public static <T> Result<T> warning(List<String> messages) {
        return warning(messages, null);
    }

    /**
     * 警告時、メッセージとデータ両方戻り
     * 
     * @param messates メッセージ
     * @param data 戻りデータ
     * @return 戻り値
     */
    public static <T> Result<T> warning(List<String> messages, T data) {

        return new Result<T>(warning, messages, data);
    };

    /**
     * 異常時、メッセージのみ戻り
     * 
     * @param messates メッセージ
     * @return 戻り値
     */
    public static <T> Result<T> failure(List<String> messages) {

        return failure(messages, null);
    };

    /**
     * 異常時、メッセージとデータ両方戻り
     * 
     * @param messates メッセージ
     * @param data 戻りデータ
     * @return 戻り値
     */
    public static <T> Result<T> failure(List<String> messages, T data) {

        return new Result<T>(failure, messages, data);
    };
}
