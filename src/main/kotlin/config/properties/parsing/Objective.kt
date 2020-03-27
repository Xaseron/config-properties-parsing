package config.properties.parsing


data class Objective(
    val objectiveId: String,
    val objective: String,
    val acronym: String?,
    val description: String,
    val targetValue: String,
    val underlyingMetrics: List<UnderlyingMetric>
)

data class UnderlyingMetric(
    val metricName: String,
    val descriptionLink: String
)
