package com.sadikul.kotlindependencyinjection.data.db

import androidx.lifecycle.LiveData
import com.sadikul.kotlindependencyinjection.data.model.Description

interface DescriptionDao {
    fun addDescription(description: Description)
    fun getDescriptions(): LiveData<List<Description>>
}