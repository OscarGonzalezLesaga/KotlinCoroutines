package com.lesaga.gonzalez.oscar.testcoroutineskotlin

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch


infix fun <T> Deferred<T>.then(block: (T) -> Unit): Job {
    return GlobalScope.launch {
        block(this@then.await())
    }
}