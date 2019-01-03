package com.company;

public class Q3_MemberClass {
    String  MemberName;
    int     MemberAge, MemberSalary;


    Q3_MemberClass (String name, int age , int salary){
        this.MemberName = name;
        this.MemberAge = age;
        this.MemberSalary = salary;
    }



}

class  MemberVariable {

    Q3_MemberClass memberObject ;

    public MemberVariable(String name , int age, int salary) {

          memberObject  = new Q3_MemberClass(name,age,salary);
    }


    public String getName(){
        return memberObject.MemberName;
    }

    public int getAge(){
        return memberObject.MemberAge;
    }

    public int getSalary(){
        return memberObject.MemberSalary;
    }


}