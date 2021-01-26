package com.levirs.mysimplecleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}