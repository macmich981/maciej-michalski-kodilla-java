package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final Bun bun;
    private final int burgers;
    private final Sauce sauce;
    private final List<Ingredient> ingredients;

    private BigMac(final Bun bun, final int burgers, final Sauce sauce, final List<Ingredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigMacBuilder {
        private Bun bun;
        private int burgers;
        private Sauce sauce;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigMacBuilder Bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder Burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder Sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder Ingredients(Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            if (!validateBun(bun)) {
                throw new IllegalArgumentException("Unexpected bun");
            }
            if (!validateSauce(sauce)) {
                throw new IllegalArgumentException("Unexpected sauce");
            }
            if (!validateIngredients(ingredients)) {
                throw new IllegalArgumentException("Unexpected ingredients");
            }
            return new BigMac(bun, burgers, sauce, ingredients);
        }

        private boolean validateBun(Bun bun) {
            for (Bun theBun : Bun.values()) {
                if (theBun == bun) {
                    return true;
                }
            }
            return false;
        }

        private boolean validateSauce(Sauce sauce) {
            for (Sauce theSauce : Sauce.values()) {
                if (theSauce == sauce) {
                    return true;
                }
            }
            return false;
        }

        private boolean validateIngredients(List<Ingredient> ingredients) {
            for (Ingredient ingredient : ingredients) {
                for (Ingredient ing : Ingredient.values()) {
                    if (ing == ingredient) {
                        return true;
                    }
                }
            }
            return false;
        }

    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
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
