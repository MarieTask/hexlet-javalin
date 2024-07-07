@import org.example.hexlet.dto.courses.CoursePage
@param CoursePage page

<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
              rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
              crossorigin="anonymous">
        <title>Course</title>
    </head>
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
</html>