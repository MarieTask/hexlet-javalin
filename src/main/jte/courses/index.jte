@import org.example.hexlet.dto.courses.CoursesPage
@param CoursesPage page

@template.layout.page(
content = @`
    <body>
    <h1 class="text-body-emphasis">List of Courses</h1>
    <form action="/courses" method="get">
        <input type="search" name="term" value="${page.getTerm()}" />
        <input type="submit" value="Search" />
    </form>
    @if(page.getCourses().isEmpty())
        <p>There is no course!</p>
    @else
        <table>
            <thead>
            <tr>
                <th>Name</th>
                <th>Description</th>
            </tr>
            </thead>
            <tbody>
            @for(var user : page.getCourses())
            <tr>
                <div>
                    <td>${user.getName()}</td>
                    <td>${user.getDescription()}</td>
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
