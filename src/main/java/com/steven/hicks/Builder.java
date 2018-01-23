package com.steven.hicks;

public class Builder
{
    public static void main(String[] args)
    {
        Burger burger = new Burger.Builder()
                .calories(250).servings(1).type("Turkey").size("Extra Large").build();

        System.out.println(burger);
    }
}
