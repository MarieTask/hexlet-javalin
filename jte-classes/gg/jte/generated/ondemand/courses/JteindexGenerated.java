package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursesPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "courses/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,6,6,10,10,10,10,10,10,10,10,10,13,13,15,15,25,25,28,28,28,29,29,29,31,31,35,35,37,37,37,37,39,39,39,40,40,40,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <body>\n    <h1 class=\"text-body-emphasis\">List of Courses</h1>\n    <form action=\"/courses\" method=\"get\">\n        <input type=\"search\" name=\"term\"");
				var __jte_html_attribute_0 = page.getTerm();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" />\n        <input type=\"submit\" value=\"Search\" />\n    </form>\n    ");
				if (page.getCourses().isEmpty()) {
					jteOutput.writeContent("\n        <p>There is no course!</p>\n    ");
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
