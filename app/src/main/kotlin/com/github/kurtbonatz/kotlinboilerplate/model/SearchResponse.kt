package com.github.kurtbonatz.kotlinboilerplate.model

import com.squareup.moshi.Json

/**
 * A [SearchResponse] for searching for [Repository] on GitHub.
 *
 * @property count          The total number of results in the page
 * @property repositories   A page of [Repository] from the search
 * @See [Search repositories][https://developer.github.com/v3/search/#search-repositories]
 */
data class SearchResponse(
        @Json(name = "total_count") val count: Int,
        @Json(name = "items") val repositories: List<Repository>
)
