package com.mjc_0225;

import java.util.ArrayList;
import java.util.List;

public class CrudClass<A> implements CRUD<A>{

	private List<A> items = new ArrayList<>();

	@Override
	public void add(A item) {
		items.add(item);
	}

	@Override
	public int size() {
		return items.size();
	}

	@Override
	public A set(int index, A item) {
		checkIndex(index);
		items.set(index, item);
		return item;
	}

	@Override
	public A remove(int index) {
		checkIndex(index);
		return items.remove(index);
	}

	@Override
	public A get(int index) {
		checkIndex(index);
		return items.get(index);
	}

	@Override
	public String getJson(int index) {
		checkIndex(index);
		return toJson(items.get(index));
	}

	@Override
	public String getJsonAllItems() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");

		for(int i = 0; i < items.size(); i++) {
			sb.append(toJson(items.get(i)));
			if(i < items.size() - 1) {
				sb.append(",");
			}
		}

		sb.append("]");
		return sb.toString();
	}

	private void checkIndex(int index) {
		if(index < 0 || index >= items.size()) {
			throw new IndexOutOfBoundsException("잘못된 인덱스입니다.");
		}
	}

	private String toJson(A item) {
		if(item == null) {
			return "null";
		}
		return "\"" + item.toString() + "\"";
	}
}
