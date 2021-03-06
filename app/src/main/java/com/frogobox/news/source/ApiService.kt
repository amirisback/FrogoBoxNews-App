package com.frogobox.news.source

import com.frogobox.news.model.News
import com.frogobox.news.source.ApiUrl.QUERY_CATEGORY
import com.frogobox.news.source.ApiUrl.QUERY_COUNRTY
import com.frogobox.news.source.ApiUrl.QUERY_SERACH
import com.frogobox.news.source.ApiUrl.URL_EVERYTHING
import com.frogobox.news.source.ApiUrl.URL_TOP_HEADLINE
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * FrogoBoxNews
 * Copyright (C) 15/04/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Line     : bullbee117
 * Phone    : 081357108568
 * Majors   : D3 Teknik Informatika 2016
 * Campus   : Telkom University
 * -----------------------------------------
 * id.amirisback.frogobox
 */
interface ApiService {

    @GET(URL_TOP_HEADLINE)
    fun getTopHeadline(@Query(QUERY_COUNRTY) country : String,
                       @Query(QUERY_CATEGORY) category : String): Deferred<News>

    @GET(URL_EVERYTHING)
    fun getEverything(@Query(QUERY_SERACH) q : String): Deferred<News>

}