import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

public class Main {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Usage: java Main class.mame.of.ConcreateFactory");
			System.out.println("Example 1: java Main listfactory,ListFactory");
			System.out.println("Example 2: java Main tablefactory,TableFactory");
			System.exit(0);
		}

		Factory factory = Factory.getFactory(args[0]);

		Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
		Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");

		Link usYahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		Link jpYahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp");
		Link excite = factory.createLink("Excite", "http://www.excite.com/");
		Link google = factory.createLink("Google", "http://www.google.com/");

		Tray trayNews = factory.createTray("新聞");
		trayNews.add(asahi);
		trayNews.add(yomiuri);

		Tray trayYahoo = factory.createTray("Yahoo!");
		trayYahoo.add(usYahoo);
		trayYahoo.add(jpYahoo);

		Tray traySearch = factory.createTray("サーチエンジン");
		traySearch.add(trayYahoo);
		traySearch.add(excite);
		traySearch.add(google);

		Page page = factory.createPage("LinkPage", "田中 太郎");
		page.add(trayNews);
		page.add(traySearch);
		page.output();
	}

}
