class Animal {
    @Override
    public void speak () {
        System.out.println(``See how different animals speak.'');
    }
}
class Cat extends Animal {
    @Override
    public void speak () {
        System.out.println(``Cats speak as meow meow...'');
    }
}
