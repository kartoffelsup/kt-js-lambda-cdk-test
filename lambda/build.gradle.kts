apply {
    plugin("org.jetbrains.kotlin.js")
}

dependencies {
    implementation(kotlin("stdlib-js"))
    api(npm("aws-sdk"))
}

kotlin {
    target {
        useCommonJs()
        nodejs
    }
}
