package gg.jte.generated.ondemand.users;
import org.example.hexlet.dto.users.UsersPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "users/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,6,6,14,14,16,16,26,26,29,29,29,30,30,30,31,31,31,33,33,37,37,39,39,39,39,41,41,41,41,41,1,1,1,1};
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
						jteOutput.writeContent("\n                        <tr>\n                            <div>\n                                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(user.getFirstName());
						jteOutput.writeContent("</td>\n                                <td>");
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
