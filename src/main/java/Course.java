import java.util.ArrayList;

public abstract class Course implements SubjectOfObserver {

    private ArrayList<Observer> observers = new ArrayList<>();
    private String courseName, live;

    Course(String courseName, String live) {
        super();
        this.courseName = courseName;
        this.live = live;
    }

    public void goLive() {
        System.out.println("\nGetting updated data...");
        for (int i = 0; i < observers.size(); i++) {
            Observer ob = observers.get(i);
            ob.update(this.live);
        }
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    void setLive(String live) {
        this.live = live;
        goLive();
    }

    String getCourseName() {
        return courseName;
    }
}