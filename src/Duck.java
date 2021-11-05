public abstract class Duck {
    FlyBehaviour flyBehaviour;

    public Duck () {}

    public void performFly() {
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
}
