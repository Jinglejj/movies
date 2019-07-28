package pojo;

import lombok.Data;
import lombok.ToString;
import org.aspectj.lang.annotation.DeclareAnnotation;

import java.util.Date;

@Data
@ToString
public class Movie {
    private Integer movId;

    private String movName;

    private String movDescription;

    private Integer movType;

    private Integer movStatus;

    private Date movLastTime;

    private String movDirector;

    private Double movCore;

    private Date movReleaseTime;

    private String movActor;

    private Integer movIsCome;

    private Integer movIsHot;

    private String movImage;

    private String movPhotos;

    private String movArea;

    private Date creatTime;

    private Date updateTime;
}