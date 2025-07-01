plugins {
    kotlin("jvm") version "2.1.10"
    id("com.google.devtools.ksp") version "2.2.0-2.0.2"
}
dependencies {
    implementation("org.babyfish.jimmer:jimmer-ksp:0.9.96")
    implementation("org.babyfish.jimmer:jimmer-spring-boot-starter:0.9.96")
}

kotlin {
    sourceSets.main {
        kotlin.srcDir("build/generated/ksp/main/kotlin")
    }
}

ksp {
    arg("jimmer.dto.mutable", "true")
}