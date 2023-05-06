package com.example.gmailclone.Model

data class Account(
    val icon:Int?=null,
    val username:String,
    val email:String,
    val unreadEmails:Int
)
