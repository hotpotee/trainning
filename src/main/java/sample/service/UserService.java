package sample.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import sample.domain.UserDO;

public interface UserService extends IService<UserDO> {
    IPage<UserDO> getPage(int currentPage, int PageSize);
}
