package com.sadikul.kotlindependencyinjection.data.model

data class Description(val text:String , val author:String){
    override fun toString(): String {
        return "$text - $author"
    }
}