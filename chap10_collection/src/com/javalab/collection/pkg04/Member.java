package com.javalab.collection.pkg04;

public class Member {
   private String name;
   private int age;

   public Member(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }

   @Override
   public int hashCode() {
	  System.out.println("여기는 hashCode :"+name.hashCode()+age);
      return name.hashCode() + age;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == this) {
         return true;
      }
      if (!(obj instanceof Member)) {
         return false;
      }
      Member other = (Member) obj;
      return name.equals(other.name) && age == other.age;
   }
}