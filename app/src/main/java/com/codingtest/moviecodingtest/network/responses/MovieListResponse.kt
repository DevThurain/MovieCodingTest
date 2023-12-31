package com.codingtest.moviecodingtest.network.responses

import com.codingtest.moviecodingtest.data.vo.MovieVO
import com.google.gson.annotations.SerializedName

data class MovieListResponse(
    @SerializedName("page")
    val page: Int?,

    @SerializedName("results")
    val results: List<MovieVO>?,

    )
