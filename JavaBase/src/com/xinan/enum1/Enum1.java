package com.xinan.enum1;

public enum Enum1 {

	MON("周一", 18) {

		@Override
		public boolean isRest() {
			System.out.println("修改过的");
			return true;
		}
	},
	TUE("周一", 19), WED("周一", 20), THU("hello3", 25), FRI("hello4", 27), SAT("hello5", 18), SUN("hello6", 18);
	private String name;
	private int age;

	private Enum1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String setAge(int age) {
		this.age = age;
		return "修改年龄";
	}

	public boolean isRest() {
		System.out.println("默认");
		return false;
	}
}
