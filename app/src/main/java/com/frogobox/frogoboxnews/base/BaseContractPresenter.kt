package com.frogobox.frogoboxnews.base

/**
 * Created by yogieadrisatria on 13/10/17.
 */

interface BaseContractPresenter<V: BaseContractView> {
    fun bind(view: V)
    fun unbind()
}

