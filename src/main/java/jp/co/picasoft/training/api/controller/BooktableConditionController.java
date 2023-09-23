package jp.co.picasoft.training.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;
import jp.co.picasoft.training.common.RestfulAPIResponseResult;
import jp.co.picasoft.training.common.Result;
import jp.co.picasoft.training.common.ResultFactory;
import jp.co.picasoft.training.common.bean.BooktableCondition;
import jp.co.picasoft.training.common.service.BooktableConditionService;

@RestController
@RequestMapping("/bookcondition")
@RestfulAPIResponseResult
public class BooktableConditionController {
    
    @Resource
    private BooktableConditionService booktableConditionService;

    @GetMapping("/book-conditions")
    public List<BooktableCondition> findAll() {
        return booktableConditionService.findAll();
    }

    @GetMapping("/book-condition/{id}")
    public BooktableCondition findById(@PathVariable int id) {
        return booktableConditionService.findById(id);
    }

    @PostMapping("/save")
    public Result<?> save(@RequestBody BooktableCondition booktableCondition) {
        int maxCount = 10;
        int bookConditionCount = booktableConditionService.getCount();
        if (bookConditionCount >= maxCount){
            List<String> msgs = new ArrayList<>();
            msgs.add(String.format("検索条件の登録数は最大%dです。", maxCount));
            return ResultFactory.failure(msgs);
        }
        return ResultFactory.success(booktableConditionService.save(booktableCondition));
    }
}
