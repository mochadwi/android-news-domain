package io.mochadwi.mobilenews.domain.data.news_source.modules

import io.mochadwi.mobilenews.domain.data.news_source.SourcesItem
import io.realm.annotations.RealmModule

/**
 * Created by mochadwi on 3/29/18.
 */
@RealmModule(library = true, classes = [SourcesItem::class])
open class SourcesItemModule