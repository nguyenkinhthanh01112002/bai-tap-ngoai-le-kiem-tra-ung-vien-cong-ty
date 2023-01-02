/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapngoailecanban.checkmail.tuyendungnhanvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KINHTHANH
 */
public class Test 
{
    public static void main(String[] args) 
    {
       //tao mang tu dong de luu tru du lieu cua nhan vien
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so luong ung vien ban muon kiem tra: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            System.out.print("nhap vao ten cua nhan vien: ");
            String name = sc.nextLine();
            System.out.print("nhap vao tuoi cua nhan vien: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("nhap vao gioi tinh cua nhan vien(Male or Female): ");
            String gender = sc.nextLine();
            Employee employee = new Employee(name, gender, age);
            employees.add(employee);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("........."+"KET QUA SAU KHI LOC DANH SACH...........");
        CheckEmployee checkEmployee = new CheckEmployee();
        for(Employee o:employees)
        {
            try
            {
                 checkEmployee.check(o);
            }
            catch(ConditionRecruitmentException e)
            {
                System.out.println(""+e.getMessage());
            } 
                        
        } 
                    
    }
   
            
}
