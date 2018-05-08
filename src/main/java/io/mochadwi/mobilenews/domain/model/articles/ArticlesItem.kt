package io.mochadwi.mobilenews.domain.model.articles

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class ArticlesItem(

		@field:SerializedName("publishedAt")
		val publishedAt: String? = null,

		@field:SerializedName("author")
		val author: String = "",

		@field:SerializedName("urlToImage")
		val urlToImage: String? = null,

		@field:SerializedName("description")
		val description: String? = null,

		@field:SerializedName("source")
		val source: Source? = null,

		@field:SerializedName("title")
		val title: String? = null,

		@field:SerializedName("url")
		val url: String? = null


) {
	// TODO: Add Parcelable here
	// Ref: https://stackoverflow.com/a/47909252/3763032
	override fun toString(): String {
		return Gson().toJson(this)
	}
}