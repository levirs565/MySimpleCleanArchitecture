package com.levirs.mysimplecleanarchitecture.data

import com.levirs.mysimplecleanarchitecture.domain.IMessageRepository
import com.levirs.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }

}