package sample.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import sample.domain.DefaultDO;

public interface DefaultService extends IService<DefaultDO> {
    IPage<DefaultDO> getPage(int currentPage, int PageSize);
}
