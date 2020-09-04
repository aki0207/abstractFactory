package tableFactory;

import java.util.Iterator;

import factory.Item;
import factory.Tray;

public class TableTray extends Tray {

	public TableTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHtml() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<td>");
		buffer.append("<table width=\"100%\" border=\"1\"><tr>");
		buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + tray.size() + "\"><b>" + caption + "</b></td>");
		buffer.append("</tr>\n");
		buffer.append("<tr>\n");
		Iterator<Item> it = tray.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			buffer.append(item.makeHtml());
		}
		buffer.append("</tr></table>");
		buffer.append("</td>");
		return buffer.toString();
	}

}
