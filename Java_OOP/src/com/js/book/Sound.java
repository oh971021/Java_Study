package com.js.book;

interface Soundable{
   String sound();
}

class Cat implements Soundable{
   @Override
   public String sound() {
      return "야옹";
   }
}

class Dog implements Soundable{
   @Override
   public String sound() {
      return "멍멍";
   }
}

public class Sound {
   public static void printSound(Soundable soundable) {
      System.out.println(soundable.sound());
   }
   public static void main(String[] args) {
	   // 같은 클래스에 있으면 스테틱 앞에 클래스를 적어주지 않아도 된다.
      printSound(new Cat());
      printSound(new Dog());
   }
}