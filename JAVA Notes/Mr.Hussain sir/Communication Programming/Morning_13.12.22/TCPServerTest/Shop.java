import java.util.*;

class Shop {

	private Properties store;

	private Shop(Properties props) {
		store = props;
	}

	public static Shop open(String doc) {
		try(var input = new java.io.FileInputStream(doc)){
			Properties items = new Properties();
			items.loadFromXML(input);
			return new Shop(items);
		}catch(Exception e){
			return null;
		}	
	}

	public String getItemInfo(String name) {
		return store.getProperty(name);
	}
}

