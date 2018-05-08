package io.mochadwi.mobilenews.domain.model

/**
 * Created by mochadwi on 3/15/18.
 */
interface CloneableRealmObject<out T> {
    fun cloneRealmObject(): T
}