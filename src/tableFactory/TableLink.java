package tableFactory;

import factory.Link;

public class TableLink extends Link {

	public TableLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHtml() {
		return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
	}

}
