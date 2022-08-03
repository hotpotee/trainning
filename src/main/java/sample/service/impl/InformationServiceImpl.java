package sample.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.dao.InformationDao;
import sample.domain.InformationDO;
import sample.service.InformationService;

import java.util.List;

@Service
public class InformationServiceImpl extends ServiceImpl<InformationDao, InformationDO> implements InformationService {

    @Autowired
    InformationDao informationDao;

    @Override
    public IPage<InformationDO> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        informationDao.selectPage(page,null);
        return page;
    }

    @Override
    public IPage<InformationDO> getPage(Integer currentPage, Integer pageSize, InformationDO queryInformationDO) {
        IPage page = new Page(currentPage,pageSize);
        LambdaQueryWrapper<InformationDO> lqw = new LambdaQueryWrapper<InformationDO>();
        lqw.like(Strings.isNotEmpty(queryInformationDO.getDicName()),InformationDO::getDicName,queryInformationDO.getDicName());
        lqw.like(Strings.isNotEmpty(queryInformationDO.getDicProject()),InformationDO::getDicProject,queryInformationDO.getDicProject());
        return informationDao.selectPage(page,lqw);

    }

    @Override
    public Boolean addInfo(InformationDO informationDO) {
        return informationDao.addInfo(informationDO);
    }

    @Override
    public Boolean addValue(InformationDO informationDO) {
        return informationDao.addValue(informationDO);
    }

    @Override
    public Boolean addMirror(InformationDO informationDO) {
        return informationDao.addMirror(informationDO);
    }

    @Override
    public Boolean addTls(InformationDO informationDO) {
        return informationDao.addTls(informationDO);
    }

    @Override
    public Boolean addUser(InformationDO informationDO) {
        return informationDao.addUser(informationDO);
    }

}
