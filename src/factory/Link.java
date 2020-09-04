package factory;

/**
 * HTMLのハイパーリンクを抽象的に表現したクラス
 *
 */
public abstract class Link extends Item{
	// リンクの飛び先のURL保持用
	protected String url;

	 public Link(String caption, String url) {
		 super(caption);
		 this.url = url;
	}

}
