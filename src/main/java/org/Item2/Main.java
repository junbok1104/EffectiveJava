package org.Item2;

public class Main {
    public static void main(String[] args) {
//        NutritionFactsForJavaBeans cocaCola = new NutritionFactsForJavaBeans();
//        cocaCola.setServingSize(240);
//        cocaCola.setServings(8);
//        cocaCola.setCalories(100);
//        cocaCola.setFat(0);
//        cocaCola.setSodium(35);
//        cocaCola.setCarbohydrate(27);

//        NutritionFactsForBuilder cola = new NutritionFactsForBuilder.Builder(240, 8)
//                .calories(100).sodium(35).carbohydrate(30).build();

//        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
//                .addTopping(Pizza.Topping.SUSAGE)
//                .addTopping(Pizza.Topping.ONION)
//                .build();
//
//        CalzonePizza calzonePizza = new CalzonePizza.Builder()
//                .addTopping(Pizza.Topping.HAM)
//                .sauceInside()
//                .build();
//
//        System.out.println(nyPizza.toString());
//        System.out.println(calzonePizza.toString());

        NutritionFactsForAnnotation a = NutritionFactsForAnnotation.builder()
                .servings(10)
                .sodium(10)
                .fat(10)
                .carbohydrate(10)
                .build();

        System.out.println(a);
    }
}