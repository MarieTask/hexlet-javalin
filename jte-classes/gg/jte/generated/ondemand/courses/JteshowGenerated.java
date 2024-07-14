package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursePage;
public final class JteshowGenerated {
	public static final String JTE_NAME = "courses/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,6,6,20,20,20,21,21,21,27,27,27,27,29,29,29,30,30,30,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursePage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <h1 class=\"text-body-emphasis\">Course</h1>\n    <body>\n    <div class=\"col-lg-8 mx-auto p-4 py-md-5\">\n        <table>\n            <caption align=\"top\">Course</caption>\n            <thead>\n            <tr>\n                <th>Name</th>\n                <th>Description</th>\n            </tr>\n            </thead>\n            <tbody>\n            <tr>\n                <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getCourse().getName());
				jteOutput.writeContent("</td>\n                <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getCourse().getDescription());
				jteOutput.writeContent("</td>\n            </tr>\n            </tbody>\n        </table>\n    </div>\n    </body>\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <p><a href=\"https://github.com/MarieTask\">Welcome to my GitHub profile!</a></p>\n");
			}
		});
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursePage page = (CoursePage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
