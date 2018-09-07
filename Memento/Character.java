public class Character {
    private int mAttack;
    private int mDefence;
    private String mName;
    private int mHealthPoint;
    private int mManaPoint;

    public Character(String name, int attack, int defence, int hp, int mp) {
        mName = name;
        mAttack = attack;
        mDefence = defence;
        mHealthPoint = hp;
        mManaPoint = mp;
    }

    public void attack() {
        mManaPoint -= 10;
    }

    public void defence(int attack) {
        mHealthPoint = mHealthPoint - (mDefence - attack);
    }

    public void show() {
        System.out.println(mName + ": Attack=" + mAttack + ", Defence=" + mDefence + ", HP=" + mHealthPoint + ", MP=" + mManaPoint);
    }

    public Memento saveCharacter() {
        return new Memento(mName, mAttack, mDefence, mHealthPoint, mManaPoint);
    }

    public void restoreCharacter(Memento mem) {
        mName = mem.name;
        mAttack = mem.attack;
        mDefence = mem.defence;
        mHealthPoint = mem.hp;
        mManaPoint = mem.mp;
    }
}