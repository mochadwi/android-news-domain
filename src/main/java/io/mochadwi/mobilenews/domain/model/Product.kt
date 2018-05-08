package io.mochadwi.mobilenews.domain.model

import com.google.gson.annotations.SerializedName

data class Product(
        @SerializedName("id")
        var id: Int = 0,
        @SerializedName("title")
        var title: String? = null,
        @SerializedName("isbn")
        var isbn: String? = null,
        @SerializedName("publisher_name")
        var publisherName: String? = null,
        @SerializedName("author_name")
        var authorName: String? = null,
        @SerializedName("created_at")
        var createdAt: String? = null,
        @SerializedName("updated_at")
        var updatedAt: String? = null,
        @SerializedName("url_photo")
        var urlPhoto: String? = null
)
