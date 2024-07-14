package gg.jte.generated.ondemand.users;
import org.example.hexlet.dto.users.UserPage;
public final class JteshowGenerated {
	public static final String JTE_NAME = "users/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,6,6,21,21,21,22,22,22,23,23,23,29,29,29,29,31,31,31,31,31,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UserPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n        <h1 class=\"text-body-emphasis\">User</h1>\n        <body>\n        <div class=\"col-lg-8 mx-auto p-4 py-md-5\">\n            <table>\n                <caption align=\"top\">User</caption>\n                <thead>\n                    <tr>\n                        <th>First name</th>\n                        <th>Last name</th>\n                        <th>Email</th>\n                    </tr>\n                </thead>\n                <tbody>\n                    <tr>\n                        <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getUser().getFirstName());
				jteOutput.writeContent("</td>\n                        <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getUser().getLastName());
				jteOutput.writeContent("</td>\n                        <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getUser().getEmail());
				jteOutput.writeContent("</td>\n                    </tr>\n                </tbody>\n            </table>\n        </div>\n        </body>\n    ");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <p><a href=\"https://github.com/MarieTask\">Welcome to my GitHub profile!</a></p>\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UserPage page = (UserPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
