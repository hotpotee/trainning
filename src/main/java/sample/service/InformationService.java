package sample.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import sample.domain.InformationDO;

import javax.sound.sampled.Line;
import java.util.List;

public interface InformationService extends IService<InformationDO> {
    IPage<InformationDO> getPage(int currentPage, int PageSize);
    IPage<InformationDO> getPage(Integer currentPage,Integer pageSize,InformationDO queryInformationDO);

    Boolean addInfo(InformationDO informationDO);

    Boolean addValue(InformationDO informationDO);

    Boolean addMirror(InformationDO informationDO);

    Boolean addTls(InformationDO informationDO);

    Boolean addUser(InformationDO informationDO);
}
