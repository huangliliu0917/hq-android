package com.huotu.android.couponsleague.mvp.contract

import com.huotu.android.couponsleague.bean.ApiResult
import com.huotu.android.couponsleague.bean.UserBean
import com.huotu.android.couponsleague.mvp.IPresenter
import com.huotu.android.couponsleague.mvp.IView


interface LoginContract {
    interface Presenter: IPresenter {
        fun loginByVerifyCode(phone :String , code :String)
        fun sendVerifyCode(phone:String)
    }

    interface View: IView<Presenter> {
        fun loginByVerifyCodeCallback(apiResult: ApiResult<UserBean>)

        fun sendVerifyCodeCallback(apiResult: ApiResult<Any>)
    }
}