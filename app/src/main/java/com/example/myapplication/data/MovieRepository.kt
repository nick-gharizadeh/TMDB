package com.example.myapplication.data

import com.example.myapplication.model.Movie
import com.example.myapplication.model.MovieDetail
import com.example.myapplication.model.VideoMovie

class MovieRepository (val movieRemoteDataSource:MovieRemoteDataSource){
    
    suspend fun getMovie():List<Movie>{
        return movieRemoteDataSource.getMovie()
    }
    suspend fun getUpComingMovies():List<Movie>{
        return movieRemoteDataSource.getUpComingMovies()
    }
    suspend fun searchMovie(query:String,adult:Boolean):List<Movie>{
        return movieRemoteDataSource.searchMovie(query,adult)
    }
    suspend fun MovieDetail(id:Int): MovieDetail {
        return movieRemoteDataSource.MovieDetail(id)
    }

    suspend fun videoOfMovie(id:Int): VideoMovie {
        return movieRemoteDataSource.videoOfMovie(id)
    }

}