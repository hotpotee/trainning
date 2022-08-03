package sample.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.dao.ProjectDao;
import sample.domain.ProjectDO;
import sample.service.ProjectService;

@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectDao, ProjectDO> implements ProjectService {

    @Autowired
    ProjectDao projectDao;

    @Override
    public IPage<ProjectDO> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        projectDao.selectPage(page,null);
        return page;
    }

}
