package sample.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import sample.domain.TlsDO;

public interface TlsService extends IService<TlsDO> {

    IPage<TlsDO> getPage(int currentPage, int PageSize);

}
