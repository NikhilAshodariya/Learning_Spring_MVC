package in.blogspot.codewithnikhil.gontu.annotation.controller;

import java.util.Date;
import java.util.List;
import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student
{

    @Pattern(regexp = "[^0-9]*", message = "javandva name galat ha")
    private String studentName;

    @Size(min = 4, max = 30)
    @IsValidHobby
    private String studentHobby;

    @Max(20000)
    private Long studentMobile;

    @Past //past means that if DOB is in future then generate an error
    private Date studentDOB;
    private List<String> studentSkills;

    private Address studentAddress;

    public Address getStudentAddress()
    {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress)
    {
        this.studentAddress = studentAddress;
    }

    public Date getStudentDOB()
    {
        return studentDOB;
    }

    public void setStudentDOB(Date studentDOB)
    {
        this.studentDOB = studentDOB;
    }

    public Long getStudentMobile()
    {
        return studentMobile;
    }

    public void setStudentMobile(Long studentMobile)
    {
        this.studentMobile = studentMobile;
    }

    public List<String> getStudentSkills()
    {
        return studentSkills;
    }

    public void setStudentSkills(List<String> studentSkills)
    {
        this.studentSkills = studentSkills;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public String getStudentHobby()
    {
        return studentHobby;
    }

    public void setStudentHobby(String studentHobby)
    {
        this.studentHobby = studentHobby;
    }

    @Override
    public String toString()
    {
        return "Student{" + "studentName=" + studentName + ", studentHobby=" + studentHobby + ", studentMobile=" + studentMobile + ", studentDOB=" + studentDOB + ", studentSkills=" + studentSkills + ", studentAddress=" + studentAddress + '}';
    }
}
