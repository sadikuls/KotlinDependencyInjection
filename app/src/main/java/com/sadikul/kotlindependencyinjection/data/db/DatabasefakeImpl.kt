package com.sadikul.kotlindependencyinjection.data.db

class DatabasefakeImpl: Database {
    override val descriptionDao: DescriptionDao = DescriptionDaoFakeImpl()

}