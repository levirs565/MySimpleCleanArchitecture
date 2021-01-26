package com.levirs.mysimplecleanarchitecture.data

import com.levirs.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}