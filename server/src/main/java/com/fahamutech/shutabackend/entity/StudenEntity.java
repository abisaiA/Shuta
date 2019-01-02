package com.fahamutech.shutabackend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "studen", schema = "mydb", catalog = "")
public class StudenEntity {
    private int id;
    private int userInformationId;
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
    @Column(name = "user_information_id", nullable = false, insertable = false, updatable = false)
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
        StudenEntity that = (StudenEntity) o;
        return id == that.id &&
                userInformationId == that.userInformationId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userInformationId);
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
