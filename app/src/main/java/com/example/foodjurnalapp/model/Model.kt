package com.example.foodjurnalapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @ColumnInfo(name="name")
    var name:String,
    @ColumnInfo(name="age")
    var age:String,
    @ColumnInfo(name="gender")
    var gender:String,
    @ColumnInfo(name="weight")
    var weight:String,
    @ColumnInfo(name="height")
    var height:String,
    @ColumnInfo(name="goal")
    var title:String
){
    @PrimaryKey(autoGenerate = true)
    var uuid:Int=0
}