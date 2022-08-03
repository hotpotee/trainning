package sample.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "dic_type_user")
public class UserDO {

    private Integer id;
    private String userName;
    private String userPassword;
    @TableId
    private Integer infoId;

}
