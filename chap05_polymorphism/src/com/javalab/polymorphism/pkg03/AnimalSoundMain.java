package com.javalab.polymorphism.pkg03;

/**
 * 매개변수의 다형성 예제 - 객체를 매개변수로 전달할 때 받는 쪽에서 부모 타입으로 받을 수 있는 것을 말함.
 */
public class AnimalSoundMain {
   public static void main(String[] args) {

      // 동물울음소리를 구현해주는 객체 생성
      AnimalSound animalSounds = new AnimalSound();
      // 자식 객체를 생성해서 부모 타입에 저장(다형성)
      Dog dog = new Dog();   
      Cat cat = new Cat();
      Tiger tiger = new Tiger();
      
      Animal tiger2 = new Tiger();
      
      animalSounds.makeAnimalSound(dog);
      animalSounds.makeAnimalSound(cat);
      animalSounds.makeAnimalSound(tiger);
      
      animalSounds.makeAnimalSound(tiger2);
   }
}