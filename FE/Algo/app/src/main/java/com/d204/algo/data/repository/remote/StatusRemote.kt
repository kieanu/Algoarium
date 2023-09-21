package com.d204.algo.data.repository.remote

import com.d204.algo.data.api.NetworkResult
import com.d204.algo.data.model.Status
import com.d204.algo.remote.model.ProblemModel

interface StatusRemote {
    suspend fun isRemote(): Boolean
    suspend fun getStatus(userId: Long): NetworkResult<Status>
    suspend fun updateMemo(problemModel: ProblemModel): NetworkResult<Unit>
}
