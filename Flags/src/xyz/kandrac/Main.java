package xyz.kandrac;

public class Main {

    public static void main(String[] args) {
        Animation animation = new Animation();
        animation.setFlags(Animation.ANIMATION_CANCELABLE | Animation.ANIMATION_RUNNING);

        System.out.println("Animation is running : " + animation.isRunning());
        System.out.println("Animation is forward : " + animation.isForward());
        System.out.println("Animation is cancellable : " + animation.isCancelable());
    }
}
