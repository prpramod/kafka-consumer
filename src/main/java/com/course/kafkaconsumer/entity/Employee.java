package com.course.kafkaconsumer.entity;

import com.course.kafkaconsumer.json.CustomLocalDateDeserializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;

public class Employee {

    @JsonProperty("employee_id")
    private int employeeId;
    private String name;

    @JsonProperty("birth_date")
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate birthDate;

    public Employee(int employeeId, String name, LocalDate birthDate) {
        this.employeeId = employeeId;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
