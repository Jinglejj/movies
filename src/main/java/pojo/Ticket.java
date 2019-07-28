package pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Ticket {
    private Integer tkId;

    private Integer tkStatus;

    private String dictSeat;

    private Integer dictHall;

    private String dictStartTime;

    private String cineAddress;

    private Integer userId;

    private Date creatTime;

    private Date updateTime;
}