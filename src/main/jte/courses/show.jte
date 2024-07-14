@import org.example.hexlet.dto.courses.CoursePage
@param CoursePage page

@template.layout.page(
content = @`
    <h1 class="text-body-emphasis">Course</h1>
    <body>
    <div class="col-lg-8 mx-auto p-4 py-md-5">
        <table>
            <caption align="top">Course</caption>
            <thead>
            <tr>
                <th>Name</th>
                <th>Description</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>${page.getCourse().getName()}</td>
                <td>${page.getCourse().getDescription()}</td>
            </tr>
            </tbody>
        </table>
    </div>
    </body>
`,
footer = @`
    <p><a href="https://github.com/MarieTask">Welcome to my GitHub profile!</a></p>
`
)
