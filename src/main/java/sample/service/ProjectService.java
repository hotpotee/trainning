package sample.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import sample.domain.ProjectDO;

public interface ProjectService extends IService<ProjectDO> {
    IPage<ProjectDO> getPage(int currentPage, int PageSize);
}
