package lesson8.task4;

import java.util.Objects;

public class Product {
    private String nameToy;
    Product(String name){
        nameToy = name;
    }

    @Override
    public String toString() {
        return "Product{" + "nameToy='" + nameToy + '\'' + '}';
    }

    public String getNameToy() {
        return nameToy;
    }

    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameToy, product.nameToy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameToy);
    }
}
