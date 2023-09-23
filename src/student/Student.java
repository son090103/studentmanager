
package student;


public class Student {
    private int ID;
    private String name;
    private String Semester;
    private String courseName;

    public Student() {
    }

    public Student(int ID, String name, String Semester, String courseName) {
        this.ID = ID;
        this.name = name;
        this.Semester = Semester;
        this.courseName = courseName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return  "ID=" + ID + ", name=" + name + ", Semester=" + Semester + ", courseName=" + courseName ;
    }
    
}
