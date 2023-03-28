package com.xadiyatullox.instagram.presenter

import com.xadiyatullox.instagram.model.Data

interface MV {
    fun onUsersGetSuccess(user: List<Data>)
    fun onUsersGetFailure(error: String)

}