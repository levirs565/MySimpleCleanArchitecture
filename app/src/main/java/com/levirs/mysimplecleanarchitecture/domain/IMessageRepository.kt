package com.levirs.mysimplecleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}