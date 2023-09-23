package jp.co.picasoft.training.common.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class BooktableCondition {

    /**
     * ID
     */
    private int id;

    /**
     * 検索条件名称
     */
    private String conditionName;

    /**
     * 本名検索条件
     */
    private String bookNameCondition;

    /**
     * 著作者検索条件
     */
    private String authorNameCondition;

    /**
     * 発行年月日
     */
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Tokyo")
    private Date publishedDateCondition;

    /**
     * 削除フラグ
     */
    private boolean deleteFlag;
}
