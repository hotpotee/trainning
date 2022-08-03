package sample.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "dic_type_mirror")
public class MirrorDO {

    Integer id;
    String url;
    String name;
    String email;
    String password;
    @TableId
    Integer infoId;

}
