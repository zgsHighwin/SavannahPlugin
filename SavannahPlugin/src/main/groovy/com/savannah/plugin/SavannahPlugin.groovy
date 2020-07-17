package com.savannah.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class SavannahPlugin implements Plugin<Project> {

    @Override
    void apply(final Project project) {
        println("Savannah ---  init")
        def extension = project.extensions.create('SavannahExtension', SavannahExtension)
        println('hello ')
        println("extension:${extension}")
        project.afterEvaluate {
            println "Hello ${extension.author}!"
        }
    }
}