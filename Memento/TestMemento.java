public class TestMemento {
    public static void main(String[] args) {
        System.out.println("This is Memento Pattern");

        Character character = new Character("Fighter",100, 50, 200, 100);
        CareTaker careTaker = new CareTaker();

        character.attack(); // mp: 90
        character.attack(); // mp: 80
        character.show();
        careTaker.saveState(character.saveCharacter());
        character.defence(30); // hp: 180
        character.show();
        careTaker.saveState(character.saveCharacter());
        character.attack(); // mp: 70
        character.show();
        character.restoreCharacter(careTaker.getState());
        character.restoreCharacter(careTaker.getState());
        character.show();
    }
}