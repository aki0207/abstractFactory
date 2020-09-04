package listFactory;

import java.util.Iterator;

import factory.Item;
import factory.Tray;

public class ListTray extends Tray {

	public ListTray(String caption) {
		super(caption);
	}

	public String makeHtml() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>\n");
		buffer.append(caption + "\n");
		buffer.append("<ul>\n");
		Iterator<Item> it = tray.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			buffer.append(item.makeHtml());
		}
		buffer.append("</ul>\n");
		buffer.append("</li>\n");
		return buffer.toString();
	}

}
