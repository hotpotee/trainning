package sample.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sample.controller.utils.R;
import sample.domain.ProjectDO;
import sample.service.ProjectService;

import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public R getAll() {
        return new R(true, projectService.list());
    }

    @PostMapping
    public R save(@RequestBody ProjectDO projectDO) {
        return new R(projectService.save(projectDO));
    }

    @PutMapping
    public R update(@RequestBody ProjectDO projectDO) {
        return new R(projectService.updateById(projectDO));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(projectService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, projectService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
        return new R(true, projectService.getPage(currentPage, pageSize));
    }

}

