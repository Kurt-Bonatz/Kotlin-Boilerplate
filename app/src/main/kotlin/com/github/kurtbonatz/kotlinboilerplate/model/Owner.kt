package com.github.kurtbonatz.kotlinboilerplate.model

import com.squareup.moshi.Json

/**
 * The [Owner] of a GitHub [Repository].
 *
 * @property avatarUrl  The url to this owner's avatar image
 * @property name       The name to display for this owner
 * @property id         The owner's unique identifier
 * @See [Search repositories][https://developer.github.com/v3/search/#search-repositories]
 */
data class Owner(
        @Json(name = "avatar_url") val avatarUrl: String,
        @Json(name = "login") val name: String,
        val id: Int
)
