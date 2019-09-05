package com.sadikul.kotlindependencyinjection.data.db

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sadikul.kotlindependencyinjection.data.model.Description

class DescriptionDaoFakeImpl : DescriptionDao {
    private val descriptionList = mutableListOf<Description>()
    private val descriptions = MutableLiveData<List<Description>>()

    init {
        descriptions.value = descriptionList
    }
    override fun addDescription(description: Description) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        descriptionList.add(description)
        descriptions.value = descriptionList
    }

    override fun getDescriptions() = descriptions as  LiveData<List<Description>>
}