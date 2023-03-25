package com.example.dependencyinjection

fun main() {
    Car(Container.provideEngine(), Container.provideDriver())
}