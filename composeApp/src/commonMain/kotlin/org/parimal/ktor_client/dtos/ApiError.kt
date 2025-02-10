package org.example.project.ktor_client.dtos

import kotlinx.serialization.Serializable


@Serializable
data class ApiError (
    val message: String,
    val status: String,
    val subErrors: List<String>
)