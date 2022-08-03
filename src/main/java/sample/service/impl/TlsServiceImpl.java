package sample.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.dao.TlsDao;
import sample.domain.TlsDO;
import sample.service.TlsService;

@Service
public class TlsServiceImpl extends ServiceImpl<TlsDao, TlsDO> implements TlsService {

    @Autowired
    private TlsDao tlsDao;

    @Override
    public IPage<TlsDO> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        tlsDao.selectPage(page,null);
        return page;
    }
}
