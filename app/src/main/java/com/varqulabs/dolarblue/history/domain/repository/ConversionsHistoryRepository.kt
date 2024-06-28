package com.varqulabs.dolarblue.history.domain.repository

import com.varqulabs.dolarblue.history.domain.model.ConversionsHistory
import kotlinx.coroutines.flow.Flow

interface ConversionsHistoryRepository {

    suspend fun getConversionsHistoryFlow(): Flow<List<ConversionsHistory>>

    suspend fun updateConversion(conversionId: Int, conversionName: String)

    suspend fun deleteConversion(conversionId: Int)

    suspend fun addConversionFavorite(conversionId: Int, isFavorite: Boolean)

    suspend fun getFavoriteConversionsHistory(): Flow<List<ConversionsHistory>>

    suspend fun searchConversionsHistoryByQuery(columnName: String, querySearch: String): Flow<List<ConversionsHistory>>
}