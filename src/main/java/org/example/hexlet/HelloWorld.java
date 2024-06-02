package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> config.bundledPlugins.enableDevLogging());
        // Описываем, что загрузится по адресу /
        // Обратите внимание, что id — это не обязательно число
        // Название параметров мы выбрали произвольно
        app.get("/users/{id}/post/{postId}", ctx -> {
            var id = ctx.pathParam("id");
            var postId =  ctx.pathParam("postId");
            ctx.result("User ID: " + id + " Post ID: " + postId);
        });

        app.post("/users", ctx -> ctx.result("POST /users"));
        app.start(7070);
    }
}