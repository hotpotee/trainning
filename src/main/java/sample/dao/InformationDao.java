package sample.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import sample.domain.InformationDO;


@Mapper
public interface InformationDao extends BaseMapper<InformationDO> {

    Boolean addInfo(InformationDO informationDO);

    Boolean addValue(InformationDO informationDO);

    Boolean addMirror(InformationDO informationDO);

    Boolean addTls(InformationDO informationDO);

    Boolean addUser(InformationDO informationDO);

}
