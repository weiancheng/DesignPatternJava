public class Door implements IDoor {
    public Door() {
    }

    @Override
    public void lock() {
        System.out.println("lock the door");
    }

    @Override
    public void unlock() {
        System.out.println("unlock the door");
    }
}