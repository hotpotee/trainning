package sample.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "dic_type_tls")
public class TlsDO {

    Integer id;
    String certificate;
    String privateKey;
    @TableId
    Integer infoId;

}
