@import org.example.hexlet.dto.courses.CoursesPage
@param CoursesPage page

<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
              rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
              crossorigin="anonymous">
        <title>Хекслет</title>
    </head>
    <body>
        <h1 class="text-body-emphasis">List of Courses</h1>
        @if(page.getCourses().isEmpty())
            <p>There is no course!</p>
        @else
            <table>
                <caption align="top">Courses</caption>
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
                            <td>${course.getName()}</td>
                            <td>${course.getDescription()}</td>
                        </div>
                        @endfor
                    </tr>
                </tbody>
            </table>
        @endif
    </body>
</html>
