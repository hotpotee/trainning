package sample.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.dao.UserDao;
import sample.domain.UserDO;
import sample.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao,UserDO> implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public IPage<UserDO> getPage(int currentPage, int pageSize) {
		IPage page = new Page(currentPage, pageSize);
		userDao.selectPage(page,null);
		return page;
	}

}

