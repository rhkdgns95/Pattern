package org.java.design_patterns.iterator;

public class ArrayMenu implements Menu {
	static final int MAX = 3;
	MenuItem[] items;
	int idx;

	public ArrayMenu() {
		items = new MenuItem[MAX];
		idx = 0;
		
		addMenuItem(new MenuItem("복숭아 아이스티", "복숭아 향이나는 음료", 2.21));
		addMenuItem(new MenuItem("겉절이", "배추가 들어간 반찬", 2.21));
		addMenuItem(new MenuItem("해물 칼국수", "다양한 해산물이 들어간 메인요리", 4.33));
		
		
	}

	public MenuItem getArrayMenuItem(int position) {
		return items[position];
	}
	
	public void addMenuItem(MenuItem menuItem) {
		if (this.idx >= MAX) {
			System.out.println("더 이상 추가하실수없습니다.");
			return;
		} else {
			this.items[idx++] = menuItem;
		}
	}

	@Override
	public Iterator createIterator() {
		return new ArrayMenuIterator(items);
	}

}
