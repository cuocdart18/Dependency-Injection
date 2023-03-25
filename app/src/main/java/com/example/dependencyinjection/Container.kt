package com.example.dependencyinjection

object Container {
    fun provideEngine() = Engine()

    fun provideDriver() = Driver()
}