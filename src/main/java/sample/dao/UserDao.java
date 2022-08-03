package sample.dao;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


import sample.domain.UserDO;

@Mapper
public interface UserDao extends BaseMapper<UserDO> {

    void save(UserDO userDO);

    UserDO selectById(String id);

    List<UserDO> selectAll();

    void deleteById(String id);

    void updateById(String id);
}

