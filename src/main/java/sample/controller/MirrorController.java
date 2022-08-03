package sample.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sample.controller.utils.R;
import sample.domain.MirrorDO;
import sample.service.MirrorService;

import java.util.List;

@RestController
@RequestMapping("/api/mirror")
public class MirrorController {

    @Autowired
    private MirrorService mirrorService;

    @GetMapping
    public R getAll() {
        return new R(true, mirrorService.list());
    }

    @PostMapping
    public R save(@RequestBody MirrorDO mirrorDO) {
        return new R(mirrorService.save(mirrorDO));
    }

    @PutMapping
    public R update(@RequestBody MirrorDO mirrorDO) {
        return new R(mirrorService.updateById(mirrorDO));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(mirrorService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, mirrorService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
        return new R(true, mirrorService.getPage(currentPage, pageSize));
    }

}
