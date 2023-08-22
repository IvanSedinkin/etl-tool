plugins {
    kotlin("jvm") version "1.8.20"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.0"
    application
}

group = "etl.org"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(11)
}
