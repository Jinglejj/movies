package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import pojo.Movie;

public interface MovieMapper {
    int deleteByPrimaryKey(Integer movId);

    int insert(Movie record);

    Movie selectByPrimaryKey(Integer movId);

    List<Movie> selectAll();

    List<Movie> findByName(String name);

    int updateByPrimaryKey(Movie record);
}