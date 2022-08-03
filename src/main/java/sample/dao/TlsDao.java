package sample.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import sample.domain.TlsDO;

@Mapper
public interface TlsDao extends BaseMapper<TlsDO> {

}
