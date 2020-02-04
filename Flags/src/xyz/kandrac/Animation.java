package xyz.kandrac;

public class Animation {

    public static final int ANIMATION_RUNNING = 0b001;
    public static final int ANIMATION_FORWARD = 0b010;
    public static final int ANIMATION_CANCELABLE = 0b100;

    private int animationFlags;

    /**
     * Cele kuzlo flagov sa odohrava tu. Vsetky flagy su ulozene v jednej premennej a
     * pre zistenie aktivity flagu pouzivame bitovy sucin.
     *
     * @param flag to be checked
     * @return true if flag is active
     * @see #isRunning()
     * @see #isForward()
     * @see #isCancelable()
     */
    private boolean isFlagActive(int flag) {
        return (animationFlags & flag) > 0;
    }

    /**
     * Zaroven vieme nastavit viacero flagov naraz
     * @param flags to be set
     */
    public void setFlags(int flags) {
        animationFlags |= flags;
    }

    /**
     * @return true if animation is currently running
     */
    boolean isRunning() {
        return isFlagActive(ANIMATION_RUNNING);
    }

    /**
     * @return true if animation is heading forward
     */
    boolean isForward() {
        return isFlagActive(ANIMATION_FORWARD);
    }

    /**
     * @return true if animation can be cancelled
     */
    boolean isCancelable() {
        return isFlagActive(ANIMATION_CANCELABLE);
    }

}
