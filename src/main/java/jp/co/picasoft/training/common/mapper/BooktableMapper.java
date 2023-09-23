package jp.co.picasoft.training.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import jp.co.picasoft.training.common.Result;
import jp.co.picasoft.training.common.bean.Booktable;

/**
 * Booktableマッパー
 * 
 * @author zhangcg
 * @version 1.0
 */
@Mapper
public interface BooktableMapper {

    /**
     * 全件検索
     * 
     * @return 全件検索結果
     */
    public List<Booktable> findAll();

    /**
     * IDよりの検索
     * 
     * @param id ID
     * @return IDよりの検索結果
     */
    public Booktable findById(int id);

    /**
     * 条件よりの検索
     * 
     * @param booktable 条件
     * @return 条件よりの検索結果
     */
    public List<Booktable> findBooksByCondistion(Booktable booktable);

    /**
     * ブック保存
     * 
     * @param booktable 保存対象
     * @return 保存結果
     */
    public int save(Booktable booktable);

    public int delete(@Param("books") List<Booktable> booktables);

    public int update(Booktable booktable);
}
