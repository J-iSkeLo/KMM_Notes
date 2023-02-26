package dev.jiskelo.kmmnotes.shared.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Product(
    @SerialName("availability")
    val availability: String,
    @SerialName("bar_code")
    val barCode: String?,
    @SerialName("categories")
    val categories: List<Category>,
    @SerialName("created_at")
    val createdAt: String,
    @SerialName("description")
    val description: String?,
    @SerialName("hidden")
    val hidden: Boolean,
    @SerialName("id")
    val id: Int,
    @SerialName("lg_image_uri")
    val largeImageUri: String,
    @SerialName("original_image_uri")
    val originalImageUri: String?,
    @SerialName("price")
    val price: Double,
    @SerialName("quantity")
    val quantity: Int,
    @SerialName("recommended")
    val recommended: Boolean,
    @SerialName("sm_image_uri")
    val smallImageUri: String,
    @SerialName("title")
    val title: String,
    @SerialName("uid")
    val uid: String,
    @SerialName("updated_at")
    val updatedAt: String
)