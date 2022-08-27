package com.zurmati.lazylist.sealed

import com.zurmati.lazylist.models.Food

sealed class DataState {
    class Success(val data: MutableList<Food>) : DataState()
    class Failure(val message: String) : DataState()
    object Loading : DataState()
    object Empty : DataState()
}