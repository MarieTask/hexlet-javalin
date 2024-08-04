//Создаем дата-класс, который передает в шаблон данные формы и ошибки.
//Ошибки передаются в виде объекта, который формирует Javalin в случае ошибки валидации

package org.example.hexlet.dto.users;

import io.javalin.validation.ValidationError;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BuildUserPage {
    private String firstName;
    private String lastName;
    private String email;
    private Map<String, List<ValidationError<Object>>> errors;
}
