package org.Item2;

public class NutritionFactsForBuilder {
    private final int servingSize; //(mL, 1회 제공량)  필수
    private final int servings;   //(회, 총 n회 제공량) 필수
    private final int calories;   //(1회 제공량당)     선택
    private final int fat;        //(g/1회 제공량)     선택
    private final int sodium;     //(mg/1회 제공량)    선택
    private final int carbohydrate; // (g/1회 제공량)  선택

    public NutritionFactsForBuilder(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static class Builder {
        // 필수 매개변수
        private final int servingSize;
        private final int servings;

        // 선택 매개변수
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        // 필수 매개변수만을 담은 Builder 생성자
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        // 선택 매개변수의 setter, Builder 자신을 반환해 연쇄적으로 호출 가능
        public Builder calories(int val) {
            calories = val;
            return this;
        }
        public Builder fat(int val) {
            fat = val;
            return this;
        }
        public Builder sodium(int val) {
            calories = val;
            return this;
        }
        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        // build() 호출로 최종 불변 객체를 얻는다.
        public NutritionFactsForBuilder build() {
            return new NutritionFactsForBuilder(this);
        }
    }
}
