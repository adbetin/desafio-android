package com.concrete.andresdavid.desafioandroid.repository

import com.concrete.andresdavid.desafioandroid.model.Repository
import com.concrete.andresdavid.desafioandroid.model.RepositoryResponse
import com.concrete.andresdavid.desafioandroid.remote.GithubApiService
import io.reactivex.Observable

class RepositoryRepository {
    private val api: GithubApiService = GithubApiService.create()

    fun searchUsers(page: Int): Observable<List<Repository>> {
        return api.javaRepositories("language:Java", "stars", page).map { response: RepositoryResponse ->
            response.items
        }
    }

}