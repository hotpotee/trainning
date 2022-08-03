package sample.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.dao.MirrorDao;
import sample.domain.MirrorDO;
import sample.service.MirrorService;

@Service
public class MirrorServiceImpl extends ServiceImpl<MirrorDao, MirrorDO> implements MirrorService {

    @Autowired
    MirrorDao mirrorDao;

    @Override
    public IPage<MirrorDO> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        mirrorDao.selectPage(page,null);
        return page;
    }

}
