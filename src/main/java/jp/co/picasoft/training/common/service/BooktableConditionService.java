package jp.co.picasoft.training.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import jp.co.picasoft.training.common.bean.BooktableCondition;
import jp.co.picasoft.training.common.mapper.BooktableConditionMapper;

@Service
public class BooktableConditionService {
    
    @Resource
    private BooktableConditionMapper booktableConditionMapper;

    public List<BooktableCondition> findAll() {
        return booktableConditionMapper.findAll();
    }

    public BooktableCondition findById(int id){
        return booktableConditionMapper.findById(id);
    }

	public int save(BooktableCondition booktableCondition) {
		return booktableConditionMapper.save(booktableCondition);
	}

	public int getCount() {
        return booktableConditionMapper.getCount();
	}
}
