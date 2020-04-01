apply {
    plugin("org.jetbrains.kotlin.js")
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(npm("@aws-cdk/core"))
    implementation(npm("@aws-cdk/aws-lambda"))
}

kotlin {
    target {
        useCommonJs()
        nodejs()
    }
}
