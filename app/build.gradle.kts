plugins {
    id("com.github.ben-manes.versions") version "0.52.0"
    id("application")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

application {
    mainClass = "org.gradle.sample.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}