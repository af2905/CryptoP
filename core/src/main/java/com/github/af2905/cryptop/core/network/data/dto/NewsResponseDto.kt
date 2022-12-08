package com.github.af2905.cryptop.core.network.data.dto

import com.google.gson.annotations.SerializedName

data class NewsResponseDto(
    @SerializedName("Data") val data: List<News>
)

data class News(
    @SerializedName("id") val id: String,
    @SerializedName("guid") val guId: String?,
    @SerializedName("published_on") val publishedOn: Long?,
    @SerializedName("imageurl") val imageUrl: String?,
    @SerializedName("title") val title: String?,
    @SerializedName("url") val url: String?,
    @SerializedName("source") val source: String?,
    @SerializedName("body") val body: String?,
    @SerializedName("tags") val tags: String?,
    @SerializedName("categories") val categories: String?,
    @SerializedName("upvotes") val upVotes: String?,
    @SerializedName("downvotes") val downVotes: String?,
    @SerializedName("lang") val lang: String?,
    @SerializedName("source_info") val sourceInfo: SourceInfo?
)

data class SourceInfo(
    @SerializedName("name") val name: String?,
    @SerializedName("img") val img: String?
)