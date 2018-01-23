package com.steven.hicks;

public class Burger
{
    private String size;
    private String type;
    private String servings;
    private String calories;


    public static class Builder
    {
        private final int servings;

        public Builder()
        {
            servings = 1;

        }
    }
}
