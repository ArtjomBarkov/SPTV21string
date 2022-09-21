/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21string;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class sptv21string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("------Работа со строкой------");
      System.out.print("Введите строку (используй латиницу)");
      Scanner scanner=new Scanner(System.in);
      String str= scanner.nextLine();
      do{
      System.out.println("Функции программы");
      System.out.println("0.Выйти из программы");
      System.out.println("1.Посчитай количество символов в строке");
      System.out.println("2 Посчитай количество слов в строчке");
      System.out.println("3.Найти подстрочку в строке");
      System.out.println("4.Заменить подстоку в строке на указанную");
      int numFunc= scanner.nextInt();
      scanner.nextLine();
      if(numFunc ==0){
          break;
      }
      else if (numFunc==1){
          System.out.println("Вы выбрали"+numFunc);
          int countCharInStr=0;
          char[] chars= str.toCharArray();
          for(int i =0; i<chars.length;i++){
              if(chars[i] != ' '){
              countCharInStr++;}
          }
          System.out.println("В строке"+countCharInStr++ +"символов");
      }
      
      else if (numFunc==2){
          System.out.println("Вы выбрали"+numFunc);
          
      }
      else if (numFunc==3){
          System.out.println("Вы выбрали"+numFunc);
      }
      else if (numFunc==4){
          System.out.println("Вы выбрали"+numFunc);
          System.out.println("Введите новую строку");
          String removeString = scanner.nextLine();
          String newStr;
          int index = str.indexOf(removeString);
          if (index<0){
              System.out.println("Такой строки в тексте нет");
          }else{
              System.out.println("на какую строку заменит");
              newStr = scanner.nextLine();
              System.out.println("Измененния в строке выглядят так:");
              System.out.println(str.replace(removeString, newStr));
          }
      }
      
    }while(true);
    
}
}