package dao;

import java.util.List;
import pojo.Cinema;

public interface CinemaMapper {
    int deleteByPrimaryKey(Integer cineId);

    int insert(Cinema record);

    Cinema selectByPrimaryKey(Integer cineId);

    List<Cinema> selectAll();

    int updateByPrimaryKey(Cinema record);
}