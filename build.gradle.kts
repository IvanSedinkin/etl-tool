import org.gradle.internal.impldep.org.junit.experimental.categories.Categories.CategoryFilter.include

plugins {
    kotlin("jvm") version "1.8.20"
    application
}

group = "etl.org"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(11)
}


