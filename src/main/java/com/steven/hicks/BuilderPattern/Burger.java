package com.steven.hicks.BuilderPattern;

public class Burger
{
    private String size;
    private String type;
    private int servings;
    private int calories;

    public String toString()
    {
        return "Burger Size " + size + " type " + type + " servings " + servings + " calories " + calories;
    }

    public static class Builder
    {
        private int servings;
        private int calories;
        private String size;
        private String type;

        public Builder servings(int serving)
        {
            servings = serving;
            return this;
        }
        public Builder calories(int calories)
        {
            this.calories = calories;
            return this;
        }
        public Builder size(String size)
        {
            this.size = size;
            return this;
        }
        public Builder type(String type)
        {
            this.type = type;
            return this;
        }

        public Burger build()
        {
            return new Burger(this);
        }
    }

    private Burger(Builder builder)
    {
        calories = builder.calories;
        size = builder.size;
        type = builder.type;
        servings = builder.servings;
    }
}
