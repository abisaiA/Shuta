package com.fahamutech.shutabackend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "authentication", schema = "mydb", catalog = "")
public class AuthenticationEntity {
    private int id;
    private String hashPassword;
    private String reset;
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
    @Column(name = "hash_password", nullable = false, length = 45)
    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    @Basic
    @Column(name = "reset", nullable = true, length = 45)
    public String getReset() {
        return reset;
    }

    public void setReset(String reset) {
        this.reset = reset;
    }

    @Basic
    @Column(name = "user_information_id", nullable = false, updatable = false, insertable = false)
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
        AuthenticationEntity that = (AuthenticationEntity) o;
        return id == that.id &&
                userInformationId == that.userInformationId &&
                Objects.equals(hashPassword, that.hashPassword) &&
                Objects.equals(reset, that.reset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hashPassword, reset, userInformationId);
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
