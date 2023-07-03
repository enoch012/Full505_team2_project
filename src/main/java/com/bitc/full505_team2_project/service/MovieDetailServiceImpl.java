package com.bitc.full505_team2_project.service;

import com.bitc.full505_team2_project.dto.MovieDTO;
import com.bitc.full505_team2_project.mapper.MovieDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieDetailServiceImpl implements MovieDetailService {

    @Autowired MovieDetailMapper mdm;
    @Override
    public void makeData(String movieTitle) throws Exception {
        mdm.makeData(movieTitle);
    }

    @Override
    public int getMoviePk(String movieTitle) throws Exception {
        int pk = mdm.getMoviePk(movieTitle);
        return pk;
    }
    @Override
    public MovieDTO selectMovieInfo(int moviePk) throws Exception {
        MovieDTO movie = mdm.selectMovieInfo(moviePk);
        return movie;
    }
}