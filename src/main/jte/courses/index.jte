@import org.example.hexlet.util.NamedRoutes
@import org.example.hexlet.dto.courses.CoursesPage
@import org.example.hexlet.util.Security
@param CoursesPage page

@template.layout.page(
content = @`
    <body>
    <h1 class="text-body-emphasis">List of Courses</h1>

    <div class="mb-3">
        <a href="/users/build">Добавить новый курс</a>
    </div>

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
            @for(var course : page.getCourses())
            <tr>
                <div>
                    <td><h2><a href="${NamedRoutes.coursePath(course.getId())}">${course.getName()}</a></h2></td>
                    <td>${course.getDescription()}</td>
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
