package factory;

public abstract class Item {
	// 見出しを表す
	protected String caption;

	public Item(String caption) {
		this.caption = caption;
	}
	public abstract String makeHtml();
}
