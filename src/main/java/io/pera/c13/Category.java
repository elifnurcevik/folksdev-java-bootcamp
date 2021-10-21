package io.pera.c13;

public class Category {

    String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String toString() {
        return categoryName;
    }

    public static void main(String[] args) {
        Category category = new Category("HOUSE");
        Category category1 = new Category("GARDEN");
        System.out.println(category);
        System.out.println(category1);

        change(category, category1);

        System.out.println(category);
        System.out.println(category1);
    }

    private static void change(Category category, Category category1) {
        Category value = category;
        category = category1;
        category1 = value;

        System.out.println(category);
        System.out.println(category1);
    }
}
