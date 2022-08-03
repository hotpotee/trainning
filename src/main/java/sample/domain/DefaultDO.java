package sample.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "dic_type_default")
public class DefaultDO {

    Integer id;
    String dicKey;
    String dicValue;
    @TableId
    Integer infoId;


}
