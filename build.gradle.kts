import org.apache.tools.ant.taskdefs.condition.Os

plugins {
    java
    `java-library`
    id("org.springframework.boot") version "3.2.3"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "io.github.sztuwebclub.webcheckin"
version = libs.versions.project.get()

buildscript {
    repositories {
        maven {
            setUrl("https://maven.aliyun.com/repository/gradle-plugin/")
        }
    }
}

allprojects {
    repositories {
        maven {
            setUrl("https://maven.aliyun.com/repository/public/")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/gradle-plugin/")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/central/")
        }
    }
    tasks.withType<JavaCompile> {
        options.encoding = "utf-8"
        sourceCompatibility = JavaVersion.VERSION_21.toString()
        targetCompatibility = JavaVersion.VERSION_21.toString()
    }
}

subprojects {
    apply(plugin = "java")

    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
    }
}

val installGitHook = tasks.register("installGitHooks", Copy::class) {
    group = "Git Hook"
    description = "copy git hook to .git"
    from(project.rootDir.resolve("scripts/pre-commit"))
    into(project.rootDir.resolve(".git/hooks"))
    fileMode = 775
}

tasks.getByName("prepareKotlinBuildScriptModel").dependsOn(installGitHook)

dependencies {
    implementation(libs.springboot.web)
    implementation(libs.springboot.data.redis)
    implementation(libs.springboot.data.jdbc)
    implementation(libs.springboot.security)
    implementation(libs.springboot.actuator)
    implementation(libs.springboot.validation)

    implementation(libs.jjwt)

    implementation(libs.alibaba.druid)
    implementation(libs.mybatis.plus)
    implementation(libs.mybatis.spring)

    implementation(libs.log4j.api)
    implementation(libs.log4j.core)
    implementation(libs.jakarta)
    implementation(libs.lombok)

    annotationProcessor(libs.lombok)
    runtimeOnly(libs.mysql)
    testImplementation(libs.log4j.slf4j2)
}