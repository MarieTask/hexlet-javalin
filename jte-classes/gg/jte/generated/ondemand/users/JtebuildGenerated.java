package gg.jte.generated.ondemand.users;
public final class JtebuildGenerated {
	public static final String JTE_NAME = "users/build.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,2,2,30,30,30,30,30,30,30,30};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <form action=\"/users\" method=\"post\">\n        <div>\n            <label>\n                first name\n                <input type=\"text\" required name=\"firstName\" />\n            </label>\n        </div>\n        <div>\n            <label>\n                last name\n                <input type=\"text\" required name=\"lastName\" />\n            </label>\n        </div>\n        <div>\n            <label>\n                email\n                <input type=\"email\" required name=\"email\" />\n            </label>\n        </div>\n        <div>\n            <label>\n                password\n                <input type=\"password\" required name=\"password\" />\n            </label>\n        </div>\n        <input type=\"submit\" value=\"Зарегистрировать\" />\n    </form>\n");
			}
		}, null);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}