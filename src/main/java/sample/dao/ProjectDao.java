package sample.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import sample.domain.ProjectDO;

@Mapper
public interface ProjectDao extends BaseMapper<ProjectDO> {
}
