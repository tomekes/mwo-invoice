package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.Collection;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private Collection<Product> products;

	public void addProduct(Product product) {
		// TODO: implement
	}

	public void addProduct(Product product, Integer quantity) {
		// TODO: implement
	}

	public BigDecimal getNetPrice() {
		return null;
	}

	public BigDecimal getTax() {
		return null;
	}

	public BigDecimal getGrossPrice() {
		return null;
	}
}
