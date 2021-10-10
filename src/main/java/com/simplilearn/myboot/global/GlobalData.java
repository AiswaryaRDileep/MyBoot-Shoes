package com.simplilearn.myboot.global;

import java.util.ArrayList;
import java.util.List;

import com.simplilearn.myboot.model.Product;

public class GlobalData {
	public static List<Product> cart;
	static {
		cart = new ArrayList<Product>();
	}

}
