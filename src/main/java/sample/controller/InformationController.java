package sample.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sample.controller.utils.R;
import sample.domain.DefaultDO;
import sample.domain.InformationDO;
import sample.service.InformationService;

import java.util.List;

@RestController
@RequestMapping("/api/information")
public class InformationController {

    @Autowired
    private InformationService informationService;

    @GetMapping
    public R getAll() {
        return new R(true, informationService.list());
    }

    @PostMapping
    public R save(@RequestBody InformationDO informationDO) {
        return new R(informationService.save(informationDO));
    }

    @PutMapping
    public R update(@RequestBody InformationDO informationDO) {
        return new R(informationService.updateById(informationDO));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(informationService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, informationService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
        return new R(true, informationService.getPage(currentPage, pageSize));
    }

    @GetMapping("/condition/{currentPage}/{pageSize}")
    public R selectByCondition(@PathVariable int currentPage, @PathVariable int pageSize, InformationDO informationDO) {
        System.out.println("参数========》" + informationDO);
        IPage<InformationDO> pageInfo = informationService.getPage(currentPage, pageSize, informationDO);
        return new R(null != pageInfo, pageInfo);
    }

    @PostMapping("/compound1")
    @Transactional
    public R compoundDefault(@RequestBody InformationDO informationDO) {
        informationService.addInfo(informationDO);
        return new R(informationService.addValue(informationDO));
    }

    @PostMapping("/compound2")
    @Transactional
    public R compoundMirror(@RequestBody InformationDO informationDO) {
        informationService.addInfo(informationDO);
        return new R(informationService.addMirror(informationDO));
    }

    @PostMapping("/compound3")
    @Transactional
    public R compoundTls(@RequestBody InformationDO informationDO) {
        informationService.addInfo(informationDO);
        return new R(informationService.addTls(informationDO));
    }

    @PostMapping("/compound4")
    @Transactional
    public R compoundUser(@RequestBody InformationDO informationDO) {
        informationService.addInfo(informationDO);
        return new R(informationService.addUser(informationDO));
    }

}