package dev.jiskelo.kmmnotes.shared.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Category(
    @SerialName("created_at")
    val createdAt: String?,
    @SerialName("icon_uri")
    val iconUri: String?,
    @SerialName("id")
    val id: Int,
    @SerialName("is_final")
    val isFinal: Boolean,
    @SerialName("level")
    val level: Int,
    @SerialName("name")
    val name: String,
    @SerialName("order")
    val order: Int,
    @SerialName("parent_id")
    val parentId: Int?,
    @SerialName("pivot")
    val pivot: Pivot,
    @SerialName("slug")
    val slug: String,
    @SerialName("updated_at")
    val updatedAt: String
)