package pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class User {
    private Integer userid;

    private String userName;

    private String userPwd;

    private String userEmail;

    private Integer userClass;

    private Date creatTime;

    private Date updateTime;
}