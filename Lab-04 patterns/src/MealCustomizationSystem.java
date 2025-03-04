/*
   Lab 4: Assignment One Meal Customization System
   Sadeem Aljahdali
   2116258
 */

// Meal options
 class Meal {
    private String appetizer;
    private String mainCourse;
    private String sideDish;
    private String dessert;
    private String dietaryPreference;


    // Private constructor to enforce builder usage
    private Meal(MealBuilder builder) {
        this.appetizer = builder.appetizer;
        this.mainCourse = builder.mainCourse;
        this.sideDish = builder.sideDish;
        this.dessert = builder.dessert;
        this.dietaryPreference = builder.dietaryPreference;
    }

    @Override
    public String toString() {
        return
                "\n - Appetizer = " + appetizer +
                "\n - Main Course = " + mainCourse +
                "\n - Side Dish = " + sideDish +
                "\n - Dessert = " + dessert +
                "\n - Dietary Preference = " + dietaryPreference;
    }
    // Builder Class
    static class MealBuilder {
        private String appetizer;
        private String mainCourse;
        private String sideDish;
        private String dessert;
        private String dietaryPreference;

        public MealBuilder setAppetizer(String appetizer) {
            this.appetizer = appetizer;
            return this;
        }

        public MealBuilder setMainCourse(String mainCourse) {
            this.mainCourse = mainCourse;
            return this;
        }

        public MealBuilder setSideDish(String sideDish) {
            this.sideDish = sideDish;
            return this;
        }

        public MealBuilder setDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public MealBuilder setDietaryPreference(String dietaryPreference) {
            this.dietaryPreference = dietaryPreference;
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }
}
 // Director Class to create preset meals
 class MealDirector {
    public Meal LowCarb() {
        return new Meal.MealBuilder()
                .setAppetizer("Avocado & Shrimp Salad")
                .setMainCourse("Grilled Salmon with Lemon Butter Sauce")
                .setSideDish("Roasted Asparagus")
                .setDessert("Sugar-Free Chocolate Mousse")
                .setDietaryPreference("Low Carb")
                .build();
    }

    public Meal KidsMenu() {
        return new Meal.MealBuilder()
                .setAppetizer("Cheese Sticks")
                .setMainCourse(" Chicken Nuggets with Fries Frise")
                .setSideDish("Steamed Carrots")
                .setDessert(" Vanilla Ice Cream")
                .setDietaryPreference("Kids Meal")
                .build();
    }
}

 // Customize Meal
 public class MealCustomizationSystem {
    public static void main(String[] args) {
        // Using the builder to create a custom meal
        Meal customMeal = new Meal.MealBuilder()
                .setAppetizer("Garlic Bread")
                .setMainCourse("Steak")
                .setSideDish("Mashed Potatoes")
                .setDessert("Chocolate Cake")
                .setDietaryPreference("Non-Vegetarian")
                .build();

        System.out.println("Custom Meal: " + customMeal);

        // Using the director for predefined meals
        MealDirector director = new MealDirector();
        Meal LowCarbMeal = director.LowCarb();
        Meal KidsMeal = director.KidsMenu();

        System.out.println("Low Carb Meal: " + LowCarbMeal);
        System.out.println("Kids Meal: " + KidsMeal );
    }
}