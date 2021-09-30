package com.js.book;

interface Soundable{
   String sound();
}

class Cat implements Soundable{
   @Override
   public String sound() {
      return "�߿�";
   }
}

class Dog implements Soundable{
   @Override
   public String sound() {
      return "�۸�";
   }
}

public class Sound {
   public static void printSound(Soundable soundable) {
      System.out.println(soundable.sound());
   }
   public static void main(String[] args) {
	   // ���� Ŭ������ ������ ����ƽ �տ� Ŭ������ �������� �ʾƵ� �ȴ�.
      printSound(new Cat());
      printSound(new Dog());
   }
}