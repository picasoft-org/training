package jp.co.picasoft.training.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import jp.co.picasoft.training.common.bean.BooktableCondition;

@Mapper
public interface BooktableConditionMapper {

    public List<BooktableCondition> findAll();

    public BooktableCondition findById(int id);

	public int save(BooktableCondition booktableCondition);

    public int getCount();
}
