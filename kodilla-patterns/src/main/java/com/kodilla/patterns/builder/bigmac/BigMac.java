package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class BigMac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;
    private static final List ALLOWED_BUN = Arrays.asList("sezam", "");
    private static final List ALLOWED_SAUCE = Arrays.asList("standard", "1000 wysp", "barbecue", "");
    private static final List<String> ALLOWED_INGREDIENTS = Arrays.asList("sałata", "cebula", "bekon", "ogorek", "papryczki chili", "pieczarki", "krewetki", "ser");

    private BigMac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;

    }

    public static class BigMacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder Bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder Burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder Sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder Ingredients(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            if (!validateBun(bun)) {
                throw new IllegalStateException("Unexpected bun");
            }
            if (!validateSauce(sauce)) {
                throw new IllegalStateException("Unexpected sauce");
            }
            if (!validateIngredients(ingredients)) {
                throw new IllegalStateException("Unexpected ingredients");
            }
            return new BigMac(bun, burgers, sauce, ingredients);
        }

        private boolean validateBun(String bun) {
            return ALLOWED_BUN.contains(bun);
        }

        private boolean validateSauce(String sauce) {
            return ALLOWED_SAUCE.contains(sauce);
        }

        private boolean validateIngredients(List<String> ingredients) {
            return ALLOWED_INGREDIENTS.containsAll(ingredients);
        }

    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
