package factory;

/**
 * クラス名を指定して具体的な工場のインスタンを作成するクラス
 *
 */
public abstract class Factory {
	public static Factory getFactory(String className) {
		Factory factory = null;
		try {
			factory = (Factory)Class.forName(className).newInstance();
		} catch (ClassCastException e) {
			System.out.println("クラス " + className + "が見つかりません。");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return factory;
	}

	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);

}
