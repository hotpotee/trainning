package sample.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "dic_type_project")
public class ProjectDO {

    Integer id;
    String name;
}
