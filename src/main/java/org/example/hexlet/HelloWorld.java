package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.http.NotFoundResponse;
import io.javalin.rendering.template.JavalinJte;
import org.apache.commons.lang3.StringUtils;
import org.example.hexlet.data.DataCourses;
import org.example.hexlet.data.DataUsers;
import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.dto.users.UsersPage;
import org.example.hexlet.model.Course;
import org.example.hexlet.model.User;
import org.example.hexlet.repository.UserRepository;
import org.example.hexlet.util.Security;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static io.javalin.rendering.template.TemplateUtil.model;

public class HelloWorld {

    private static final List<Course> COURSES = DataCourses.getCourses();
    private static final List<User> USERS = DataUsers.getUsers();

    public static Javalin getApp() {
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        app.get("/", ctx -> ctx.render("index.jte"));

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
            var term = ctx.queryParam("term");
            List<Course> courses;
            // Фильтруем, только если была отправлена форма
            if (term != null) {
                courses = COURSES.stream()
                        .filter(x ->
                                StringUtils.startsWithIgnoreCase(x.getName(), term) || StringUtils.startsWithIgnoreCase(x.getDescription(), term))
                        .toList();
                /* Фильтруем курсы по term */
            } else {
                courses = COURSES;
                /* Извлекаем все курсы, которые хотим показать */
            }

            var page = new CoursesPage(courses, term);
            ctx.render("courses/index.jte", model("page", page));
        });

        //app.get("/users/{id}", ctx -> {
            //var id = ctx.pathParamAsClass("id", Long.class).get();

            //User user = USERS.stream()
            //        .filter(u -> id.equals(u.getId()))
            //        .findFirst()
            //        .orElseThrow(() -> new NotFoundResponse("User not found"));
            //var id = ctx.pathParam("id");
            //var escapedId = StringEscapeUtils.escapeHtml4(id);
            //ctx.contentType("text/html");
            //ctx.result(escapedId);

            //var page = new UserPage(user);
            //ctx.render("users/show.jte", model("page", page));
            //var id = ctx.pathParam("id");
            //var escapedId = StringEscapeUtils.escapeHtml4(id);
            //PolicyFactory policy = new HtmlPolicyBuilder()
            //        .allowElements("a")
            //        .allowUrlProtocols("http")
            //        .allowAttributes("href").onElements("a")
            //        .requireRelNofollowOnLinks()
            //        .toFactory();
            //String safeHTML = policy.sanitize(escapedId);
            //ctx.contentType("text/html");
            //ctx.result(safeHTML);
        //});

        app.get("/users", ctx -> {
            var page = new UsersPage(USERS);
            ctx.render("users/index.jte", model("page", page));
        });

        app.post("/users", ctx -> {
            var firstName = ctx.formParam("firstName");
            var lastName = ctx.formParam("lastName");
            var email = ctx.formParam("email");
            var password = ctx.formParam("password");

            var user = new User(StringUtils.capitalize(firstName.trim().toLowerCase()),
                    StringUtils.capitalize(lastName.trim().toLowerCase()),
                    email.trim().toLowerCase(),
                    Security.encrypt(password));
                UserRepository.save(user);
            ctx.redirect("/users");
        });

        app.get("/users/build", ctx -> {
            ctx.render("users/build.jte");
        });

        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
