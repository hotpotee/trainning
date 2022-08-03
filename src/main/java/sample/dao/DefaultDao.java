package sample.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import sample.domain.DefaultDO;

@Mapper
public interface DefaultDao extends BaseMapper<DefaultDO> {
}
