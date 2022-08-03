package sample.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sample.controller.utils.R;
import sample.domain.TlsDO;
import sample.service.TlsService;

import java.util.List;

@RestController
@RequestMapping("/api/tls")
public class TlsController {

    @Autowired
    private TlsService tlsService;

    @GetMapping
    public R getAll() {
        return new R(true, tlsService.list());
    }

    @PostMapping
    public R save(@RequestBody TlsDO tls) {
        return new R(tlsService.save(tls));
    }

    @PutMapping
    public R update(@RequestBody TlsDO tls) {
        return new R(tlsService.updateById(tls));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(tlsService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, tlsService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
        return new R(true, tlsService.getPage(currentPage, pageSize));
    }
}
