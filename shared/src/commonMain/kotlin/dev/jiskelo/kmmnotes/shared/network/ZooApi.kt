package dev.jiskelo.kmmnotes.shared.network

import dev.jiskelo.kmmnotes.shared.entity.Response
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class ZooApi {
    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
        install(Logging) {
            logger = Logger.SIMPLE
            level = LogLevel.INFO
        }
    }

    suspend fun getRecommended(): Response {
        return httpClient.get("https://zoo-zoo-zoo.com.ua/api/v2/products/recommended"){
            url {
                parameters.append("secret", "DkLhygeaJlgFwVgt4o2ad8Nkx13DQMMR")
                parameters.append("per_page", "30")
            }
        }.body()
    }
}