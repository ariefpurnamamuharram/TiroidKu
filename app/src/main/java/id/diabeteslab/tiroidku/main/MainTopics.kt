package id.diabeteslab.tiroidku.main

import id.diabeteslab.tiroidku.R

data class Topics(
    val title: Int,
    val body: Int,
    val img: Int
)

fun thyroidTopics(): List<Topics> {
    return listOf(
        Topics(
            R.string.thyroid_gland,
            R.string.thyroid_gland_description,
            R.drawable.img_thyroid
        ),
        Topics(
            R.string.hyperthyroidism,
            R.string.hyperthyroidism_description,
            R.drawable.img_hyperthyroidism
        ),
        Topics(
            R.string.hypothyroidism,
            R.string.hypothyroidism_description,
            R.drawable.img_hypothyroidism
        )
    )
}