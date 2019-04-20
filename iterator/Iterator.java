package org.java.design_patterns.iterator;

public interface Iterator {
	Object prev();
	int getSize();
	boolean hasPrev(int position);
	void init();
}
