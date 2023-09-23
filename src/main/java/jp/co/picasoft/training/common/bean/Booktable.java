package jp.co.picasoft.training.common.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * Booktable Bean
 * 
 * @author zhangcg
 * @version 1.0
 */
@Data
public class Booktable {

    /**
     * ID
     */
    private int id;

    /**
     * 本名前
     */
    private String bookName;;

    /**
     * ページ数
     */
    private int volumeNum;

    /**
     * 著作者
     */
    private String authorName;

    /**
     * 発行日
     */
    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Tokyo")
    private Date publishedDate;

    /**
     * 削除フラグ
     */
    private boolean deleteFlag;
}
