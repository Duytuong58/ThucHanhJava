/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan1;
import java.io.*;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class Bai4 {
    public static void main(String[] args) throws Exception {
        
  int x,y;
  Scanner input=new Scanner(System.in);
  System.out.println("nhapvao so thunhat: ");
  x=input.nextInt();
  System.out.println("nhapvao so thuhai: ");
  y=input.nextInt();
  System.out.println("tong cua hai so cuanhap la: "+(x+y));
  System.out.println("hieu cua hai so vuanhap la: "+(x-y));
  System.out.println("tich cua hai so vuanhap la: "+(x*y));
  System.out.println("thuong cua hai so vuanhap la: "+(float)x/y);
 }
    
}
