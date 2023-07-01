public class Polymorphism {
    public class PlayerRating {

        int playerPostion;
        String playerName;
        float criticOneRating;
        float criticTwoRating;
        float criticThreeRating;
        float averageRating;
        char category;

        PlayerRating(int playerPostion, String playerName) {
            this.playerName = playerName;
            this.playerPostion = playerPostion;
        }

        void calculateAverageRating(float criticOneRating, float criticTwoRating) {
            averageRating = (criticOneRating + criticTwoRating) / 2;
        }

        void calculateAverageRating(float criticOneRating, float criticTwoRating, float criticThreeRating) {
            averageRating = (criticOneRating + criticTwoRating + criticThreeRating) / 3;
        }

        void calculateCategory() {
            if (averageRating > 0.0 && averageRating <= 5.0) {
                category = 'C';
            } else if (averageRating > 5.0 && averageRating <= 8.0) {
                category = 'B';
            } else {
                category = 'A';
            }
        }

        void display() {
            calculateCategory();
            System.out.println("the player name is:" + this.playerName);
            System.out.println("the player position is:" + this.playerPostion);
            System.out.println("the average rating is:" + this.averageRating);
            System.out.println("the category is:" + this.category);

        }

        public static void main(String[] args) {
            Polymorphism p = new Polymorphism();
            PlayerRating p1 = p.new PlayerRating(1, "Beckham");
            p1.calculateAverageRating(9.0f, 9.9f);
            p1.display();
            PlayerRating p2 = p.new PlayerRating(1, "Oscar");
            p2.calculateAverageRating(1.0f, 1.0f, 1.0f);
            p2.display();
        }
    }
}