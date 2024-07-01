<!-- src/main/jte/courses/index.jte -->
@import org.example.hexlet.dto.courses.CoursesPage
@param CoursesPage page

<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>List of Users</title>
    </head>
    <body>
        <h1>${page.getHeader()}</h1>
        @if(page.getCourses().isEmpty())
            <p>There is no course!</p>
        @else
        <table>
            <caption>Courses</caption>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Description</th>
                </tr>
            </thead>
            @for(var course : page.getCourses())
                <div>
                    <h2><a href="/courses/${course.getId()}">${course.getName()}</a></h2>
                        <p>${course.getDescription()}</p>
                </div>
    @endfor
@endif
</body>
</html>