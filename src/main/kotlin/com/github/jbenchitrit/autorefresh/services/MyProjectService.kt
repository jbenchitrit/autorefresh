package com.github.jbenchitrit.autorefresh.services

import com.intellij.openapi.project.Project
import com.github.jbenchitrit.autorefresh.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
