// Путь src/org/example/hexlet/model/User.java
package org.example.hexlet.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public final class User {

    private long id;
    private String firstName;

    @ToString.Include
    private String lastName;

    private String email;

    public User(long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
