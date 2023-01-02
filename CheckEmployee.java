/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapngoailecanban.checkmail.tuyendungnhanvien;

/**
 *
 * @author KINHTHANH
 */
public class CheckEmployee 
{
    public static void check(Employee employee) throws ConditionRecruitmentException
    {
        if(employee.getGender().equalsIgnoreCase("Female"))
        {
            throw new ConditionRecruitmentException("your gender is not equal to our requirement");
        }
        if(employee.getAge()<18||employee.getAge()>45)
        {
            throw new ConditionRecruitmentException("your age is over our requirement");
        }
        
        System.out.println("you overcomed our requirements");
    }
}
