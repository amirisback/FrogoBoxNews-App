package com.frogobox.news.source

import com.frogobox.news.model.Articles

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * FrogoBoxNews
 * Copyright (C) 16/04/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Majors   : D3 Teknik Informatika 2016
 * Campus   : Telkom University
 * -----------------------------------------
 * FrogoBox Software Industries
 */
interface ApiResponse {

    suspend fun getTopHeadline(country : String, category : String) : List<Articles>
    suspend fun getEverything(q : String) : List<Articles>

}