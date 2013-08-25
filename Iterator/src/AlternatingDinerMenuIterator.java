import java.nio.channels.UnsupportedAddressTypeException;
import java.util.Iterator;
import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator{
	MenuItem[] items;
	Calendar rightNow;
	int position;
	
	public AlternatingDinerMenuIterator(MenuItem[] items) {
		this.items = items;
		Calendar rightNow = Calendar.getInstance();
		position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
		    return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 2;
		return menuItem;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("No funciona hombre");		
	}
}
