package com.lesaga.gonzalez.oscar.testcoroutineskotlin.domain.usecase

import com.lesaga.gonzalez.oscar.testcoroutineskotlin.data.entity.ErrorResponse

interface UseCase<T> {
    fun execute(callBack: UseCaseCallBack<T>)
}

interface UseCaseCallBack<T> {
    fun success(response: T)
    fun error(error: ErrorResponse)
}