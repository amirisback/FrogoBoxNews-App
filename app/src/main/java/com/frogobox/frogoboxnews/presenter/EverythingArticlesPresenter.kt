package com.frogobox.frogoboxnews.presenter

import android.app.Application
import android.util.Log
import android.widget.Toast
import com.frogobox.frogoboxnews.base.BasePresenter
import com.frogobox.frogoboxnews.helper.Constant.ON_ERROR
import com.frogobox.frogoboxnews.helper.Constant.ON_GET_DATA
import com.frogobox.frogoboxnews.helper.Constant.ON_START_PRESENTER
import com.frogobox.frogoboxnews.network.api.response.ApiResponse
import com.frogobox.frogoboxnews.network.api.call.ArticleApiServiceCall
import com.frogobox.frogoboxnews.view.interfaces.contract.ArticlesContract
import com.frogobox.frogoboxnews.view.interfaces.repository.ArticlesView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import timber.log.Timber
import java.lang.Exception

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
 * Line     : bullbee117
 * Phone    : 081357108568
 * Majors   : D3 Teknik Informatika 2016
 * Campus   : Telkom University
 * -----------------------------------------
 * id.amirisback.frogobox
 */
class EverythingArticlesPresenter(application: Application,
                                  val category:String, val q:String) :
                                    BasePresenter<ArticlesContract.View>(application),
                                    ArticlesContract.EverythingPresenter{


    val apiResponse : ApiResponse = ArticleApiServiceCall()

    override fun onCreate() {
        super.onCreate()
    }

    override fun onStart() {
        super.onStart()
        Timber.d(ON_START_PRESENTER)
    }

    override fun setupView() {
    }

    override fun onGetEverything() {
        view?.displayProgressIndicator()
        GlobalScope.launch(Dispatchers.Main) {
            try {
                val articleList = apiResponse.getEverything(category, q)
                Log.d("GET DATA", ON_GET_DATA)
                view?.onDisplayArticles(articleList)
                view?.hideProgressIndicator()
            }
            catch (e: Exception) {
                view?.onDisplayErrorMessage(e.message ?: ON_ERROR)
                view?.hideProgressIndicator()
            }
        }
    }

}