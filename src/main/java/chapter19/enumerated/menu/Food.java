package chapter19.enumerated.menu;

/**
 * Created by pyvov on 24.02.2017.
 */
public interface Food {
    enum Appetizer implements Food {
        SALAD, SOUP, SPRING_ROLLS;
    }
    enum MainCourse implements Food {
        LASGNE, BURRITO, PAD_THAI,
        LENTILS, HUMMOUS, VINDALOO;
    }
    enum Dessert implements Food {
        TIRAMISU, GELATO, BLACK_FOREST_CAKE,
        FRUIT, CREME_CARAMEL;
    }
    enum Coffee implements Food {
        BLACK_COFFEE, DECAF_COFFEE, EXPRESSO,
        LATTE, CAPPUCINO, TEA, HERB_TEA
    }
    enum Tea implements Food {
        BLACK_TEA, GREEN_TEA, RED_TEA;
    }
}
