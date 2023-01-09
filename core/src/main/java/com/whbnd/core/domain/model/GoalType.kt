package com.whbnd.core.domain.model

sealed class GoalType(val name: String) {
    object LoseWeight: GoalType("lose_weight")
    object MaintainWeight: GoalType("maintain_weight")
    object GainWeight: GoalType("gain_weight")

    companion object {
        fun fromString(name: String): GoalType {
            return when(name) {
                "lose_weight" -> LoseWeight
                "maintain_weight" -> MaintainWeight
                "gain_weight" -> GainWeight
                else -> MaintainWeight
            }
        }
    }
}