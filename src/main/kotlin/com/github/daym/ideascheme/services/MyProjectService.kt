package com.github.daym.ideascheme.services

import com.intellij.openapi.project.Project
import com.github.daym.ideascheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
