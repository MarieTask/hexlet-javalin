package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursesPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "courses/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,6,6,9,9,11,11,21,21,24,24,24,25,25,25,27,27,31,31,33,33,33,33,35,35,35,36,36,36,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <body>\n    <h1 class=\"text-body-emphasis\">List of Courses</h1>\n    ");
				if (page.getCourses().isEmpty()) {
					jteOutput.writeContent("\n        <p>There is no user!</p>\n    ");
				} else {
					jteOutput.writeContent("\n        <table>\n            <caption align=\"top\">Courses</caption>\n            <thead>\n            <tr>\n                <th>Name</th>\n                <th>Description</th>\n            </tr>\n            </thead>\n            <tbody>\n            ");
					for (var user : page.getCourses()) {
						jteOutput.writeContent("\n            <tr>\n                <div>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(user.getName());
						jteOutput.writeContent("</td>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(user.getDescription());
						jteOutput.writeContent("</td>\n                </div>\n                ");
					}
					jteOutput.writeContent("\n            </tr>\n            </tbody>\n        </table>\n    ");
				}
				jteOutput.writeContent("\n    </body>\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <p><a href=\"https://github.com/MarieTask\">Welcome to my GitHub profile!</a></p>\n");
			}
		});
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
