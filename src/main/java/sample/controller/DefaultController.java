package sample.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sample.controller.utils.R;
import sample.domain.DefaultDO;
import sample.service.DefaultService;

import java.util.List;

@RestController
@RequestMapping("/api/default")
public class DefaultController {

    @Autowired
    private DefaultService defaultService;

    @GetMapping
    public R getAll() {
        return new R(true, defaultService.list());
    }

    @PostMapping
    public R save(@RequestBody DefaultDO defaultDO) {
        return new R(defaultService.save(defaultDO));
    }

    @PutMapping
    public R update(@RequestBody DefaultDO defaultDO) {
        return new R(defaultService.updateById(defaultDO));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(defaultService.removeById(id));
    }

    @GetMapping("{infoId}")
    public R getById(@PathVariable @Param("infoId") Integer infoId) {
        return new R(true, defaultService.getById(infoId));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
        return new R(true, defaultService.getPage(currentPage, pageSize));
    }

}

