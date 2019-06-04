public  class Task1301 {
    public static class Human {
        private String name;
        private int age;
        private Sex sex;
        public Human(String name, int age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public void sayHello() {
            System.out.println("Привет");
        }
    }
    public enum Sex {
        MALE, FEMALE
    }
    public static void main(String[] args) {
        Human[] humans = {
                new Human("Fedor", 21, Sex.MALE),
                new Human("Svetlana", 22, Sex.FEMALE),
                new Human("Stepan", 21, Sex.MALE),
                new Human("Rita", 22, Sex.FEMALE),
                new Human("Ivan", 21, Sex.MALE),
                new Human("Irina", 22, Sex.FEMALE),
                new Human("Fedor", 21, Sex.MALE),
                new Human("Svetlana", 22, Sex.FEMALE),
                new Human("Max", 21, Sex.MALE),
                new Human("Elena", 22, Sex.FEMALE)
        };
        for (Human human : humans) {
            human.sayHello();
        }
    }
}

