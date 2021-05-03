public class CourseManager {
    public void Register(Student student, Course course){
        System.out.println(student.getStudentID() + " Numaralı " + student.getStudentName() + " İsimli Öğrenci " +
                course.mentorName + " Adlı eğitmenin " + course.courseID + " Numaralı " + course.courseName +
                " Kursuna başarıyla kaydoldu.");
    }
}
