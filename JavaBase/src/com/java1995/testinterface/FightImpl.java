package com.java1995.testinterface;

public class FightImpl{
	public static void main(String[] args){
	IFight i1 =new FatFat();
	i1.fight();
	IFight i2 =new Thinthin();
	i2.fight();
	}
}