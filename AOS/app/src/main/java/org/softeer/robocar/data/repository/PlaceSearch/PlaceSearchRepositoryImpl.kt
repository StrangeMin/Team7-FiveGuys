package org.softeer.robocar.data.repository.PlaceSearch

import org.softeer.robocar.data.dto.placesearch.PlaceSearchResponse
import javax.inject.Inject

class PlaceSearchRepositoryImpl @Inject constructor(
    private val placeSearchRemoteDataSource: PlaceSearchRemoteDataSource
): PlaceSearchRepository {

    override suspend fun getSearchResult(
        Authorization: String,
        query: String
    ): Result<PlaceSearchResponse> {
        return placeSearchRemoteDataSource.getSearchResult(Authorization, query)
    }

}