package test

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin implements Plugin<Project> {
    @Override
    void apply(Project target) {
        target.tasks.register("myTask", MyTask)
    }
}
