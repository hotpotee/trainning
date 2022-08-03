package sample.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sample.controller.utils.R;
import sample.domain.UserDO;
import sample.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public R getAll() {
        return new R(true, userService.list());
    }

    @PostMapping
    public R save(@RequestBody UserDO user) {
        return new R(userService.save(user));
    }

    @PutMapping
    public R update(@RequestBody UserDO user) {
        return new R(userService.updateById(user));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(userService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, userService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
        return new R(true, userService.getPage(currentPage, pageSize));
    }

}
