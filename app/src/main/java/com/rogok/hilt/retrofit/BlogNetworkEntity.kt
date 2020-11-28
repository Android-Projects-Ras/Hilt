package com.rogok.hilt.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BlogNetworkEntity(
    @SerializedName("pk")
    @Expose
    var id: Int,
    var title: String,
    var body: String,
    var image: String,
    var category: String
)