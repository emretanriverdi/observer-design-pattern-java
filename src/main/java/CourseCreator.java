

class CourseCreator {

    static Course create(String courseName) {
        return new Course(courseName, "Not live") {

            @Override
            public void registerObserver(Observer observer) {
                super.registerObserver(observer);
            }

            @Override
            public void removeObserver(Observer observer) {
                super.removeObserver(observer);
            }
        };
    }
}
