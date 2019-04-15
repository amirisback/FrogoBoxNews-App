package com.frogobox.frogoboxnews.view.interfaces

import com.frogobox.frogoboxnews.model.Articles
import com.frogobox.frogoboxnews.model.News

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
interface ArticlesView {

    fun showLoading()
    fun hideLoading()
    fun onGetArticles(articles : List<Articles>)
    fun onFailed(messageEror: String)

}