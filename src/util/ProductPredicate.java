package util;

import java.util.function.Predicate;

import entiti.Product;

public class ProductPredicate implements Predicate<Product>{// inteface funcional

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
