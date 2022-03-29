package io.github.shirohoo.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class JpaPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getTasks().register("jpa", task -> {
            task.doLast(s -> System.out.println("Jpa plugin from 'https://github.com/shirohoo/gradle-plugins/jpa'"));
        });
    }
}
