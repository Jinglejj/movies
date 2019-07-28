package dao;

import java.util.List;
import pojo.Movie;

public interface MovieMapper {
    int deleteByPrimaryKey(Integer movId);

    int insert(Movie record);

    Movie selectByPrimaryKey(Integer movId);

    List<Movie> selectAll();

    int updateByPrimaryKey(Movie record);
}