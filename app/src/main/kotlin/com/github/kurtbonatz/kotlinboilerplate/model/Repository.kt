package com.github.kurtbonatz.kotlinboilerplate.model

import com.squareup.moshi.Json

/**
 * A GitHub [Repository].
 *
 * @property description    A snippet about this repo
 * @property forks          The number of forks off of this repo
 * @property fullName       The unique name of this repo in the style of 'owner_name/repo_name'
 * @property id             This repository's unique identifier
 * @property issues         The total number of currently open issues against this repo
 * @property owner          The [Owner] of this repo
 * @property stars          The number of times this repo has been starred
 * @See [Search repositories][https://developer.github.com/v3/search/#search-repositories]
 */
data class Repository(
        val description: String,
        @Json(name = "fork_count") val forks: Int,
        @Json(name = "full_name") val fullName: String,
        val id: Int,
        @Json(name = "open_issues_count") val issues: Int,
        val owner: Owner,
        @Json(name = "stargazers_count") val stars: Int
)
