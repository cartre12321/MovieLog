package ca.criddall.movielog

import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.serialization.Serializable


class MovieDataFetcher {
    
    @Serializable
    private data class CatFact(
        val fact: String,
        val length: Int
    )
    
    private val httpClient = httpClient()

    suspend fun getFact(): String {
        return fetchCatFact().fact
    }

    private suspend fun fetchCatFact(): CatFact {
        val response: HttpResponse = httpClient.get("https://catfact.ninja/fact")
        return response.body()
    }
}