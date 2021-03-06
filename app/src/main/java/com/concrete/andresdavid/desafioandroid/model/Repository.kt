package com.concrete.andresdavid.desafioandroid.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Repository(var type: String = "REPOSITORY") {
    @SerializedName("id")
    @Expose var id: Long = 0

    @SerializedName("name")
    @Expose var name: String = ""

    @SerializedName("full_name")
    @Expose var fullName: String = ""

    @SerializedName("description")
    @Expose var description: String? = null

    @SerializedName("owner")
    @Expose var owner: User? = null

    @SerializedName("forks_count")
    @Expose var forksCount: Int? = null

    @SerializedName("stargazers_count")
    @Expose var stargazersCount: Int? = null
}