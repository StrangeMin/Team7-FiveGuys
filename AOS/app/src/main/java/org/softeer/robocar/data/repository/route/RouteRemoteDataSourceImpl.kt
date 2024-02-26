package org.softeer.robocar.data.repository.route

import org.softeer.robocar.data.service.route.RouteService
import org.softeer.robocar.data.mapper.toRoute
import org.softeer.robocar.data.model.Route
import javax.inject.Inject

class RouteRemoteDataSourceImpl @Inject constructor(
    private val routeService: RouteService
) : RouteRemoteDataSource {

    override suspend fun getRoute(
        departureAddress: String,
        hostDestAddress: String,
        guestDestAddress: String,
        hostId: Long,
        guestId: Long,
        token: String
    ): Route {
        return routeService.getRoute(
            departureAddress,
            hostDestAddress,
            guestDestAddress,
            hostId,
            guestId,
            token
        ).toRoute()
    }
}