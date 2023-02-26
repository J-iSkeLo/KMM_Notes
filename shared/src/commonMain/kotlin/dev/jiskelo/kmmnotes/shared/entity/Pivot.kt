package dev.jiskelo.kmmnotes.shared.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Pivot(
    @SerialName("category_id")
    val categoryId: Int,
    @SerialName("product_id")
    val productId: Int
)