package com.fahamutech.shutabackend.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "lecture", schema = "mydb", catalog = "")
public class LectureEntity {
    private int id;
    private int userInformationId;
    private Collection<CourseEntity> coursesById;
    private UserInformationEntity userInformationByUserInformationId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_information_id", nullable = false)
    public int getUserInformationId() {
        return userInformationId;
    }

    public void setUserInformationId(int userInformationId) {
        this.userInformationId = userInformationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LectureEntity that = (LectureEntity) o;
        return id == that.id &&
                userInformationId == that.userInformationId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userInformationId);
    }

    @OneToMany(mappedBy = "lectureByLectureId")
    public Collection<CourseEntity> getCoursesById() {
        return coursesById;
    }

    public void setCoursesById(Collection<CourseEntity> coursesById) {
        this.coursesById = coursesById;
    }

    @ManyToOne
    @JoinColumn(name = "user_information_id", referencedColumnName = "id", nullable = false)
    public UserInformationEntity getUserInformationByUserInformationId() {
        return userInformationByUserInformationId;
    }

    public void setUserInformationByUserInformationId(UserInformationEntity userInformationByUserInformationId) {
        this.userInformationByUserInformationId = userInformationByUserInformationId;
    }
}
