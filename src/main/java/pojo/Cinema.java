package pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Cinema {
    private Integer cineId;

    private String cineName;

    private String cineProvince;

    private String cineCity;

    private String cineArea;

    private String cineAddress;

    private Date creatTime;

    private Date updateTime;
}