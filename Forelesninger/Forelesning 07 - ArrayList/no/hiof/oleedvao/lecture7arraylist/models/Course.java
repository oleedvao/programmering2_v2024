package no.hiof.oleedvao.lecture7arraylist.models;

public class Course {

    private String courseName;
    private String courseCode;
    private int studyPoints;


    public Course() {

    }

    public Course(String courseName, String courseCode, int studyPoints) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.studyPoints = studyPoints;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getStudyPoints() {
        return studyPoints;
    }

    public void setStudyPoints(int studyPoints) {
        this.studyPoints = studyPoints;
    }
}