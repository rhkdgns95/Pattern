package org.java.design_patterns.iterator;

import java.util.Vector;

public class VectorMenuIterator implements Iterator {
	Vector<MenuItem> items;
	int position;

	public VectorMenuIterator(Vector<MenuItem> items) {
		this.items = items;
		init();
	}

	@Override
	public void init() {
		this.position = items.size() - 1;
	}
	
	@Override
	public MenuItem prev() {
		// TODO Auto-generated method stub
		
		return items.get(position--);
	}

	@Override
	public boolean hasPrev(int position) {
		
		return (items.size() <= 0 || position < 0) ? false : true;
	}

	@Override
	public int getSize() { 
		return items.size();
	}

}
