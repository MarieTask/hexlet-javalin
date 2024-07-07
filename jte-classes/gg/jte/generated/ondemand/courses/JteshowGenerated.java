package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursePage;
public final class JteshowGenerated {
	public static final String JTE_NAME = "courses/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,26,26,26,26,27,27,27,33,33,33,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursePage page) {
		jteOutput.writeContent("\n<html lang=\"en\">\n    <head>\n        <meta charset=\"utf-8\" />\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\n              rel=\"stylesheet\"\n              integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\n              crossorigin=\"anonymous\">\n        <title>Course</title>\n    </head>\n    <h1 class=\"text-body-emphasis\">Course</h1>\n    <body>\n        <div class=\"col-lg-8 mx-auto p-4 py-md-5\">\n            <table>\n                <caption align=\"top\">Courses</caption>\n                <thead>\n                    <tr>\n                        <th>Name</th>\n                        <th>Description</th>\n                    </tr>\n                </thead>\n                <tbody>\n                    <tr>\n                        <td>");
		jteOutput.setContext("td", null);
		jteOutput.writeUserContent(page.getCourse().getName());
		jteOutput.writeContent("</td>\n                        <td>");
		jteOutput.setContext("td", null);
		jteOutput.writeUserContent(page.getCourse().getDescription());
		jteOutput.writeContent("</td>\n                    </tr>\n                </tbody>\n            </table>\n        </div>\n    </body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursePage page = (CoursePage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
