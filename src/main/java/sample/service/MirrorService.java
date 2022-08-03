package sample.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import sample.domain.MirrorDO;

public interface MirrorService extends IService<MirrorDO> {
    IPage<MirrorDO> getPage(int currentPage, int PageSize);
}
