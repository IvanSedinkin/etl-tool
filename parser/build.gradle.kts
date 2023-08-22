plugins {
    kotlin("jvm") version "1.8.20"
}

group = "etl.org"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("it.skrape:skrapeit:1.2.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}