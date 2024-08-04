@import org.example.hexlet.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
    content = @`
        <body>
            <h1 class="text-body-emphasis">List of Users</h1>

            <div class="mb-3">
                <a href="/users/build">Зарегистрировать нового пользователя</a>
            </div>

            @if(page.getUsers().isEmpty())
                <p>There is no user!</p>
            @else
                <table>
                    <thead>
                        <tr>
                            <th>First name</th>
                            <th>Last name</th>
                            <th>Email</th>
                        </tr>
                    </thead>
                    <tbody>
                        @for(var user : page.getUsers())
                        <tr>
                            <div>
                                <td>${user.getFirstName()}</td>
                                <td>${user.getLastName()}</td>
                                <td>${user.getEmail()}</td>
                            </div>
                        @endfor
                        </tr>
                    </tbody>
                </table>
            @endif
        </body>
    `,
    footer = @`
        <p><a href="https://github.com/MarieTask">Welcome to my GitHub profile!</a></p>
    `
)