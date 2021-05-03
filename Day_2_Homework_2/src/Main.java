public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Java Geliştirme Kampı", "Engin Demiroğ", 1);
        Course course2 =new Course("C# Geliştirme Kampı","Engin Demiroğ",2);
        Student student1 = new Student();

        student1.setStudentID(1);
        student1.setStudentName("Ömer Faruk Öztürk");

        Student student2 = new Student();
        student2.setStudentID(2);
        student2.setStudentName("Beytullah Aydoğan");

        CourseManager courseManager = new CourseManager();
        courseManager.Register(student1,course1);
        courseManager.Register(student2, course2);

    }
}
