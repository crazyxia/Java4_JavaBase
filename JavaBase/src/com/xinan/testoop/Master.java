package com.xinan.testoop;

public class Master {
	
		public Pet getPet(String typeId){
			if(typeId.equalsIgnoreCase("dog")){
				Pet pet=new Dog();
				return pet;
			}
			else{
				return null;
			}
		}
	}

