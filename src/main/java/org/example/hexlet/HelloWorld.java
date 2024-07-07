package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.http.NotFoundResponse;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.model.Course;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static io.javalin.rendering.template.TemplateUtil.model;

public class HelloWorld {

    private static final List<Course> COURSES = Data.getCourses();

    public static Javalin getApp() {
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        app.get("/courses/{id}", ctx -> {
            var id = Long.parseLong(ctx.pathParam("id"));

            Optional<Course> course = COURSES.stream()
                    .filter(x -> Objects.equals(id, x.getId()))
                    .findFirst();

            if (course == null) {
                throw new NotFoundResponse("Course not found");
            }

            var courseResult = COURSES.get((int) id);
            var page = new CoursePage(courseResult);
            ctx.render("courses/show.jte", model("page", page));
        });

        app.get("/courses", ctx -> {
            var header = "Курсы по программированию";
            var page = new CoursesPage(COURSES, header);
            ctx.render("courses/index.jte", model("page", page));
        });

        app.get("/", ctx -> ctx.render("index.jte"));

        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
