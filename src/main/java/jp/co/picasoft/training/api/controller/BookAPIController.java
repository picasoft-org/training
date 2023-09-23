package jp.co.picasoft.training.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jp.co.picasoft.training.common.RestfulAPIResponseResult;
import jp.co.picasoft.training.common.Result;
import jp.co.picasoft.training.common.ResultFactory;
import jp.co.picasoft.training.common.bean.Booktable;
import jp.co.picasoft.training.common.service.BooktableService;

/**
 * Booktableのコントローラー
 */
@RestController
@RequestMapping("/book")
@RestfulAPIResponseResult
public class BookAPIController {

    /**
     * Booktableサービス
     */
    @Resource
    private BooktableService booktableService;

    /**
     * 全件検索
     * 
     * @return Booktableのリスト
     */
    @GetMapping("/books")
    public List<Booktable> findAll(HttpServletRequest request) {

        String ipAddress = request.getRemoteAddr();
        System.out.println(String.format("Access IP Address: %s", ipAddress));
        List<Booktable> results = booktableService.findAll();
        return results;
    }

    /**
     * IDよりの検索
     * 
     * @param id BooktableのID
     * @return IDよりの検索結果
     */
    @GetMapping("/{id}")
    public Booktable findById(@PathVariable int id) {
        return booktableService.findById(id);
    }

    /**
     * 条件よりの検索
     * 
     * @param booktable 条件
     * @return 条件よりの検索結果
     */
    @GetMapping("/findBooks")
    public List<Booktable> findBooksByCondistion(@ModelAttribute  Booktable booktable) {

        return booktableService.findBooksByCondistion(booktable);
    }

    /**
     * ブック保存
     * 
     * @param booktable 保存対象
     * @return 条件よりの検索結果
     */
    @PostMapping("/save")
    public Result<?> save(@RequestBody Booktable booktable) {
        return ResultFactory.success(booktableService.save(booktable));
    }

    @DeleteMapping("/delete")
    public int delete(@RequestBody ArrayList<Booktable> booktables) {
        return booktableService.delete(booktables);
    }
}
