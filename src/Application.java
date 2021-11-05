public class Application {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        //duck gets hit in the right wing
        mallardDuck.setFlyBehaviour(new FlyWithLeftWing());
        mallardDuck.performFly(); //tries to fly away with the *left* wing
    }
}
