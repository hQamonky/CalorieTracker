package com.whbnd.tracker_domain.use_case

import com.whbnd.tracker_domain.model.TrackedFood
import com.whbnd.tracker_domain.repository.TrackerRepository
import kotlinx.coroutines.flow.Flow

class DeleteTrackedFood(
    private val repository: TrackerRepository
) {
    suspend operator fun invoke(trackedFood: TrackedFood) {
        repository.deleteTrackedFood(trackedFood)
    }
}