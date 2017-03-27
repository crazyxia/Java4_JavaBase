package com.xinan.testoop;

public class Master {
	public void play(Pet pet){//使用父类Pet pet作为方法形参实现多态
		if(pet instanceof Dog){
			Dog dog=(Dog) pet;
			dog.catchingFlyDisc();
		}
		else if(pet instanceof Penguin){
			Penguin penguin=(Penguin) pet;
			penguin.swimming();
		}
		else{
			System.out.println("您输入的有误");
		}
	}
	public Pet getPet(String typeId){
		if(typeId.equalsIgnoreCase("dog")){//equalsIgnoreCase忽略大小写
			Pet pet=new Dog();
			return pet;
		}
		else if(typeId.equalsIgnoreCase("Penguin")){
			Pet pet=new Penguin();
			return pet;
		}
		else{
			System.out.println("您输入的有误");
			return null;
		}
	}
}

