package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.controller.CoursesController;
import org.example.hexlet.controller.UsersController;
import org.example.hexlet.data.DataCourses;
import org.example.hexlet.data.DataUsers;
import org.example.hexlet.model.Course;
import org.example.hexlet.model.User;
import org.example.hexlet.util.NamedRoutes;

import java.util.List;

public class HelloWorld {

    private static final List<Course> COURSES = DataCourses.getCourses();
    private static final List<User> USERS = DataUsers.getUsers();

    public static Javalin getApp() {
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        app.get("/", ctx -> ctx.render("index.jte"));

        /*app.get(NamedRoutes.coursePath("{id}"), ctx -> {
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

        app.get(NamedRoutes.coursesPath(), ctx -> {
            var term = ctx.queryParam("term");
            List<Course> courses;
            // Фильтруем, только если была отправлена форма
            if (term != null) {
                courses = COURSES.stream()
                        .filter(x ->
                                StringUtils.startsWithIgnoreCase(x.getName(), term) || StringUtils.startsWithIgnoreCase(x.getDescription(), term))
                        .toList();
                // Фильтруем курсы по term
            } else {
                courses = COURSES;
                // Извлекаем все курсы, которые хотим показать
            }
            var page = new CoursesPage(courses, term);
            ctx.render("courses/index.jte", model("page", page));
        });
        */

        /*app.get("/users/{id}", ctx -> {
            var id = ctx.pathParamAsClass("id", Long.class).get();

            User user = USERS.stream()
                    .filter(u -> id.equals(u.getId()))
                    .findFirst()
                    .orElseThrow(() -> new NotFoundResponse("User not found"));
            var id = ctx.pathParam("id");
            var escapedId = StringEscapeUtils.escapeHtml4(id);
            ctx.contentType("text/html");
            ctx.result(escapedId);

            var page = new UserPage(user);
            ctx.render("users/show.jte", model("page", page));
            var id = ctx.pathParam("id");
            var escapedId = StringEscapeUtils.escapeHtml4(id);
            PolicyFactory policy = new HtmlPolicyBuilder()
                    .allowElements("a")
                    .allowUrlProtocols("http")
                    .allowAttributes("href").onElements("a")
                    .requireRelNofollowOnLinks()
                    .toFactory();
            String safeHTML = policy.sanitize(escapedId);
            ctx.contentType("text/html");
            ctx.result(safeHTML);
        });

         */

        app.get(NamedRoutes.usersPath(), UsersController::index);
        app.get(NamedRoutes.userPath("{id}"), UsersController::show);
        app.get(NamedRoutes.buildUserPath(), UsersController::build);
        app.post(NamedRoutes.usersPath(), UsersController::create);
        app.get(NamedRoutes.editUserPath("{id}"), UsersController::edit);
        app.patch(NamedRoutes.userPath("{id}"), UsersController::update);
        app.delete(NamedRoutes.userPath("{id}"), UsersController::destroy);

        app.get(NamedRoutes.coursesPath(), CoursesController::index);
        app.get(NamedRoutes.coursePath("{id}"), CoursesController::show);
        app.get(NamedRoutes.buildCoursePath(), CoursesController::build);
        app.post(NamedRoutes.coursesPath(), CoursesController::create);
        app.get(NamedRoutes.editCoursePath("{id}"), CoursesController::edit);
        app.patch(NamedRoutes.coursePath("{id}"), CoursesController::update);
        app.delete(NamedRoutes.coursePath("{id}"), CoursesController::destroy);

        /*
        app.get(NamedRoutes.usersPath(), ctx -> {
            var page = new UsersPage(USERS);
            ctx.render("users/index.jte", model("page", page));
        });

        //Расширяем обработчик. Добавляем встроенный механизм валидации Javalin и обработку его исключений
        app.post(NamedRoutes.usersPath(), ctx -> {
            var firstName = ctx.formParam("firstName");
            var lastName = ctx.formParam("lastName");
            var email = ctx.formParam("email");

            try {
                var passwordConfirmation = ctx.formParam("passwordConfirmation");
                var password = ctx.formParamAsClass("password", String.class)
                        .check(value -> value.equals(passwordConfirmation), "Пароли не совпадают")
                        .check(value -> value.length() > 6, "У пароля недостаточная длина")
                        .get();
                var user = new User(firstName, lastName, email, password);
                //Сохраняем нового пользователя в текущий репозиторий
                USERS.add(user);
                UserRepository.save(user);
                ctx.redirect(NamedRoutes.usersPath());
            } catch (ValidationException e) {
                var page = new BuildUserPage(firstName, lastName, email, e.getErrors());
                ctx.render("users/build.jte", model("page", page));
            }
        });


        app.get(NamedRoutes.buildUserPath(), ctx -> {
            var page = new BuildUserPage();
            ctx.render("users/build.jte", model("page", page));
        });

         */

        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
