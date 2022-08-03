package sample.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.dao.DefaultDao;
import sample.domain.DefaultDO;
import sample.service.DefaultService;

@Service
public class DefaultServiceImpl extends ServiceImpl<DefaultDao, DefaultDO> implements DefaultService {

    @Autowired
    DefaultDao defaultDao;

    @Override
    public IPage<DefaultDO> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        defaultDao.selectPage(page,null);
        return page;
    }
}
