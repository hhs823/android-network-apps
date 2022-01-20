package com.survivalcoding.network_apps.feature_conferences.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Conference(
    val end: String = "",
    val link: String = "",
    val location: String = "",
    val name: String = "",
    val start: String = "",
) : Parcelable