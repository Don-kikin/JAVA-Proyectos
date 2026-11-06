package mx.edu.unam;

public class Student {
    private Long id; no usages
    private String name; no usages
    private ApprovedCourses approvedCourses; no usages
    private CompletedCourses completedCourses; no usages
    private Library Library; no usages
    private Tultion Tultion; no usages

    public Student(Long id, String name, ApprovedCourses approvedCourses, CompletedCourses completedCourses, Library library, Tultion tultion) {
        this.id = id;
        this.name = name;
        this.approvedCourses = approvedCourses;
        this.completedCourses = completedCourses;
        Library = library;
        Tultion = tultion;
    }

    public boolean canGradutate(){ no usages
        return completedCourses.meetsRequirement() && approvedCourses.meetsRequirement() && tultion.meetsRequirement() && Library.meetsRequirement();
    }
}
-