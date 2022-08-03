package sample.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import sample.domain.MirrorDO;


@Mapper
public interface MirrorDao extends BaseMapper<MirrorDO> {
}
