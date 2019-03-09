

public class Main {

    public static void main(String[] args) {

        Course designPatterns = CourseCreator.create("BIM492");
        Course internet = CourseCreator.create("BIM222");

        designPatterns.registerObserver(new Student("Frank"));
        designPatterns.registerObserver(new Student("Donnie"));
        designPatterns.setLive(designPatterns.getCourseName());

        internet.registerObserver(new Student("Emre"));
        internet.registerObserver(new Student("Arda"));
        internet.setLive(internet.getCourseName());
    }
}