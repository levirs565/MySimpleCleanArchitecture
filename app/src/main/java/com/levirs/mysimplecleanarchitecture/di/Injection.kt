package com.levirs.mysimplecleanarchitecture.di

import com.levirs.mysimplecleanarchitecture.data.IMessageDataSource
import com.levirs.mysimplecleanarchitecture.data.MessageDataSource
import com.levirs.mysimplecleanarchitecture.data.MessageRepository
import com.levirs.mysimplecleanarchitecture.domain.IMessageRepository
import com.levirs.mysimplecleanarchitecture.domain.MessageInteractor
import com.levirs.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}