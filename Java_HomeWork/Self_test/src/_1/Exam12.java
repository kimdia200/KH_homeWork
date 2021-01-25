package _1;



class World {
    String message = "안녕하세요";

    public void doSomething() {
        Hello hello = new Hello(this);
        hello.say();
    }
    class Hello {
        World world;

        public Hello(World world) {
            this.world = world;
        }

        public void say() {
            System.out.println(world.message);
        }

    }
}

public class Exam12 {

    public static void main(String[] args) {
        World world = new World();
        world.doSomething();
    }
    
}
