package com.example.core.data.source.remote.network

import com.example.core.data.source.remote.response.DetailGamesResponse
import com.example.core.data.source.remote.response.ListGamesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("games?")
    suspend fun getGamesList(
        @Query("key") key: String
    ): Response<ListGamesResponse>

    @GET("games/{id}?")
    suspend fun getDetailGames(
        @Path("id") id: Int,
        @Query("key") key: String
    ): Response<DetailGamesResponse>
}