package gg.jte.generated.ondemand.users;
import org.example.hexlet.util.NamedRoutes;
import org.example.hexlet.dto.users.UsersPage;
import org.example.hexlet.util.Security;
public final class JteindexGenerated {
	public static final String JTE_NAME = "users/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,3,3,5,5,8,8,16,16,18,18,28,28,31,31,31,31,31,31,31,31,31,31,31,31,32,32,32,33,33,33,35,35,39,39,41,41,41,41,43,43,43,43,43,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsersPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n        <body>\n            <h1 class=\"text-body-emphasis\">List of Users</h1>\n\n            <div class=\"mb-3\">\n                <a href=\"/users/build\">Зарегистрировать нового пользователя</a>\n            </div>\n\n            ");
				if (page.getUsers().isEmpty()) {
					jteOutput.writeContent("\n                <p>There is no user!</p>\n            ");
				} else {
					jteOutput.writeContent("\n                <table>\n                    <thead>\n                        <tr>\n                            <th>First name</th>\n                            <th>Last name</th>\n                            <th>Email</th>\n                        </tr>\n                    </thead>\n                    <tbody>\n                        ");
					for (var user : page.getUsers()) {
						jteOutput.writeContent("\n                        <tr>\n                            <div>\n                                <td><a");
						var __jte_html_attribute_0 = NamedRoutes.userPath(user.getId());
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
							jteOutput.writeContent(" href=\"");
							jteOutput.setContext("a", "href");
							jteOutput.writeUserContent(__jte_html_attribute_0);
							jteOutput.setContext("a", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(">");
						jteOutput.setContext("a", null);
						jteOutput.writeUserContent(user.getFirstName());
						jteOutput.writeContent("</a></td>\n                                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(user.getLastName());
						jteOutput.writeContent("</td>\n                                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(user.getEmail());
						jteOutput.writeContent("</td>\n                            </div>\n                        ");
					}
					jteOutput.writeContent("\n                        </tr>\n                    </tbody>\n                </table>\n            ");
				}
				jteOutput.writeContent("\n        </body>\n    ");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n        <p><a href=\"https://github.com/MarieTask\">Welcome to my GitHub profile!</a></p>\n    ");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UsersPage page = (UsersPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
