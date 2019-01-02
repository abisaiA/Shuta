package com.fahamutech.shutabackend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "class", schema = "mydb", catalog = "")
public class ClazzEntity {
    private int id;
    private String room;
    private int courseCode;
    private CourseEntity courseByCourseCode;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "room", nullable = false, length = 45)
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Basic
    @Column(name = "course_code", nullable = false)
    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClazzEntity that = (ClazzEntity) o;
        return id == that.id &&
                courseCode == that.courseCode &&
                Objects.equals(room, that.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, room, courseCode);
    }

    @ManyToOne
    @JoinColumn(name = "course_code", referencedColumnName = "code", nullable = false)
    public CourseEntity getCourseByCourseCode() {
        return courseByCourseCode;
    }

    public void setCourseByCourseCode(CourseEntity courseByCourseCode) {
        this.courseByCourseCode = courseByCourseCode;
    }
}
