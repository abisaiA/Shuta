package com.fahamutech.shutabackend.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "course", schema = "mydb", catalog = "")
public class CourseEntity {
    private int code;
    private String name;
    private int lectureId;
    private String description;
    private Integer weight;
    private String prerequisite;
    private String courseCode;
    private Collection<ClazzEntity> clazzesByCode;
    private LectureEntity lectureByLectureId;

    @Id
    @Column(name = "code", nullable = false)
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "lecture_id", nullable = false)
    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "weight", nullable = true)
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "prerequisite", nullable = true, length = 45)
    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    @Basic
    @Column(name = "courseCode", nullable = true, length = 45)
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseEntity that = (CourseEntity) o;
        return code == that.code &&
                lectureId == that.lectureId &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(prerequisite, that.prerequisite) &&
                Objects.equals(courseCode, that.courseCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, lectureId, description, weight, prerequisite, courseCode);
    }

    @OneToMany(mappedBy = "courseByCourseCode")
    public Collection<ClazzEntity> getClazzesByCode() {
        return clazzesByCode;
    }

    public void setClazzesByCode(Collection<ClazzEntity> clazzesByCode) {
        this.clazzesByCode = clazzesByCode;
    }

    @ManyToOne
    @JoinColumn(name = "lecture_id", referencedColumnName = "id", nullable = false)
    public LectureEntity getLectureByLectureId() {
        return lectureByLectureId;
    }

    public void setLectureByLectureId(LectureEntity lectureByLectureId) {
        this.lectureByLectureId = lectureByLectureId;
    }
}
