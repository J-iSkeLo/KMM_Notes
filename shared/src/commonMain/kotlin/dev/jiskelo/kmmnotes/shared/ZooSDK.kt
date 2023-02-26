package dev.jiskelo.kmmnotes.shared

import dev.jiskelo.kmmnotes.shared.entity.Response
import dev.jiskelo.kmmnotes.shared.network.ZooApi


class ZooSDK {
    private val api = ZooApi()

    @Throws(Exception::class) suspend fun getRecommended(forceReload: Boolean): Response {
        return api.getRecommended()
    }
}