plugins {
    id("org.jetbrains.kotlin.js") version "1.3.71" apply (false)
}

group = "io.github.kartoffelsup"
version = "1.0-SNAPSHOT"

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.js")
    }

    repositories {
        mavenLocal()
        mavenCentral()
    }
}
