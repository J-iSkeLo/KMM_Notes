package dev.jiskelo.kmmnotes.shared.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Data(
    @SerialName("current_page")
    val currentPage: Int,
    @SerialName("data")
    val products: List<Product>,
    @SerialName("first_page_url")
    val firstPageUrl: String,
    @SerialName("from")
    val from: Int,
    @SerialName("last_page")
    val lastPage: Int,
    @SerialName("last_page_url")
    val lastPageUrl: String,
    @SerialName("links")
    val links: List<Link>,
    @SerialName("next_page_url")
    val nextPageUrl: String?,
    @SerialName("path")
    val path: String,
    @SerialName("per_page")
    val perPage: Int,
    @SerialName("prev_page_url")
    val prevPageUrl: String?,
    @SerialName("to")
    val to: Int,
    @SerialName("total")
    val total: Int
)