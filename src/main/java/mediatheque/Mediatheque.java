package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}

	public void accept(MediathequeVisitor m){
		for (Item item : items){
			item.accept(m);

		}
	}

}
