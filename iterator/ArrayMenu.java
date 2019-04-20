package org.java.design_patterns.iterator;

public class ArrayMenu implements Menu {
	static final int MAX = 6;
	MenuItem[] items;
	int idx;

	public ArrayMenu() {
		items = new MenuItem[MAX];
		idx = 0;
		addMenuItem(new MenuItem("김치볶음밥", "매운 김치가 들어감", 3.77));
		addMenuItem(new MenuItem("야채볶음밥", "야채가 들어감", 3.77));
		addMenuItem(new MenuItem("고기볶음밥", "돼지고기 들어감", 3.77));
		addMenuItem(new MenuItem("카레밥", "인도카레", 3.77));
		addMenuItem(new MenuItem("짜장밥", "중국짜장", 3.77));
		addMenuItem(new MenuItem("짜장밥2", "중국짜장2", 3.77));
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
