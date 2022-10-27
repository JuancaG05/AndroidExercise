package com.exercise.androiduicomparison.data

data class Worker(
    val displayName: String,
    val startDate: String, // To simplify
    val availableHoursPerDay: Int,
    val rating: Float,
    val numberOfRatings: Int,
    val pricePerHour: Int,
)
