package service.impl;

import dao.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Movie;
import service.MovieService;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieMapper movieMapper;


    @Override
    public List<Movie> getAll() {
        return movieMapper.selectAll();
    }
}
