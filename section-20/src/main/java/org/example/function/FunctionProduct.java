package org.example.function;

import org.example.entities.Product;

import java.util.function.Function;

public class FunctionProduct implements Function<Product, String> {
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
