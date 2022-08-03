package sample.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
@TableName(value = "dic_information")
public class InformationDO {

    @TableId(type = IdType.AUTO)
    Integer dicId;
    String dicName;
    String dicProject;
    String dicAlias;
    String dicDescribe;
    String dicType;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date dicTime;

    @TableField(exist = false,select = false)
    String dicKey;
    @TableField(exist = false,select = false)
    String dicValue;
    @TableField(exist = false,select = false)
    String url;
    @TableField(exist = false,select = false)
    String name;
    @TableField(exist = false,select = false)
    String email;
    @TableField(exist = false,select = false)
    String password;
    @TableField(exist = false,select = false)
    String certificate;
    @TableField(exist = false,select = false)
    String privateKey;
    @TableField(exist = false,select = false)
    String userName;
    @TableField(exist = false,select = false)
    String userPassword;
//    List<DefaultDO> keyValue;

}
