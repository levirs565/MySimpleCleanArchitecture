package com.levirs.mysimplecleanarchitecture.data

import com.levirs.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity {
        return MessageEntity("Hello $name! Welcome to Clean Architecture")
    }
}