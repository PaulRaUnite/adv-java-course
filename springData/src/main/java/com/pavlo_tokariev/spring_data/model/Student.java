package com.pavlo_tokariev.spring_data.model;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "average_mark")
    private float averageMark;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "group_fk")
    @Cascade(value = {CascadeType.MERGE})
    private Group group;

    public Student() {
    }

    public Student(float average_mark, String firstName, String lastName, Group group) {
        this.averageMark = average_mark;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(float average_mark) {
        this.averageMark = average_mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", average_mark=" + averageMark + ", firstName='" + firstName + '\'' + ", lastName='" + lastName
                + '\'' + ", group=" + "'" + group + "'" + '}';
    }
}
