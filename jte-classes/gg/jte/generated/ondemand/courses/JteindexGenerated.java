package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursesPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "courses/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,15,15,15,17,17,27,27,30,30,30,31,31,31,33,33,37,37,40,40,40,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\n<html lang=\"en\">\n    <head>\n        <meta charset=\"utf-8\" />\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\n              rel=\"stylesheet\"\n              integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\n              crossorigin=\"anonymous\">\n        <title>Хекслет</title>\n    </head>\n    <body>\n        <h1 class=\"text-body-emphasis\">List of Courses</h1>\n        ");
		if (page.getCourses().isEmpty()) {
			jteOutput.writeContent("\n            <p>There is no course!</p>\n        ");
		} else {
			jteOutput.writeContent("\n            <table>\n                <caption align=\"top\">Courses</caption>\n                <thead>\n                    <tr>\n                        <th>Name</th>\n                        <th>Description</th>\n                    </tr>\n                </thead>\n                <tbody>\n                    ");
			for (var course : page.getCourses()) {
				jteOutput.writeContent("\n                    <tr>\n                        <div>\n                            <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(course.getName());
				jteOutput.writeContent("</td>\n                            <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(course.getDescription());
				jteOutput.writeContent("</td>\n                        </div>\n                        ");
			}
			jteOutput.writeContent("\n                    </tr>\n                </tbody>\n            </table>\n        ");
		}
		jteOutput.writeContent("\n    </body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
