package com.fahamutech.shutabackend.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "user_information", schema = "mydb", catalog = "")
public class UserInformationEntity {
    private int id;
    private String email;
    private String phoneNumber;
    private String fullname;
    private String address;
    private Collection<AuthenticationEntity> authenticationsById;
    private Collection<LectureEntity> lecturesById;
    private Collection<StudenEntity> studensById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone_number", nullable = false, length = 13)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "fullname", nullable = false, length = 45)
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 45)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInformationEntity that = (UserInformationEntity) o;
        return id == that.id &&
                Objects.equals(email, that.email) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(fullname, that.fullname) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, phoneNumber, fullname, address);
    }

    @OneToMany(mappedBy = "userInformationByUserInformationId")
    public Collection<AuthenticationEntity> getAuthenticationsById() {
        return authenticationsById;
    }

    public void setAuthenticationsById(Collection<AuthenticationEntity> authenticationsById) {
        this.authenticationsById = authenticationsById;
    }

    @OneToMany(mappedBy = "userInformationByUserInformationId")
    public Collection<LectureEntity> getLecturesById() {
        return lecturesById;
    }

    public void setLecturesById(Collection<LectureEntity> lecturesById) {
        this.lecturesById = lecturesById;
    }

    @OneToMany(mappedBy = "userInformationByUserInformationId")
    public Collection<StudenEntity> getStudensById() {
        return studensById;
    }

    public void setStudensById(Collection<StudenEntity> studensById) {
        this.studensById = studensById;
    }
}
