package jp.co.picasoft.training.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.picasoft.training.common.Result;
import jp.co.picasoft.training.common.bean.Booktable;
import jp.co.picasoft.training.common.mapper.BooktableMapper;

/**
 * Booktableのサービス
 */
@Service
public class BooktableService {

    /**
     * Booktableのマッパー
     */
    @Autowired
    private BooktableMapper booktableMapper;

    /**
     * 全件検索
     * 
     * @return 全件検索結果
     */
    public List<Booktable> findAll() {
        return booktableMapper.findAll();
    }

    /**
     * IDにより検索
     * 
     * @param id ID
     * @return IDにより検索結果
     */
    public Booktable findById(int id) {
        return booktableMapper.findById(id);
    }

    /**
     * 条件により検索
     * 
     * @param booktable 条件
     * @return 条件により検索結果
     */
    public List<Booktable> findBooksByCondistion(Booktable booktable) {
        return booktableMapper.findBooksByCondistion(booktable);
    }

	public int save(Booktable booktable) {
        if (booktable.getId() != 0) {
            return booktableMapper.update(booktable);
        }
		return booktableMapper.save(booktable);
	}

    public int delete(List<Booktable> booktables) {
        return booktableMapper.delete(booktables);
    }
}
