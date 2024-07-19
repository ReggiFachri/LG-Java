package com.lgcns.chapter10;

public class HeroTest {

	public static void main(String[] args) {

		Hero[] heroes = {
				new SuperMan(),	
				new BatMan(),	
				new SpiderMan(),	
		};

		System.out.print("List Hero : ");

		for(int i = 0; i < heroes.length; i++) {
			if(i != heroes.length - 1) {				
				System.out.print(heroes[i]+", ");
			}else {
				System.out.print(heroes[i]+"\r\n");				
			}
		}

		for(Hero hero : heroes) {
			hero.action();
		}

	}

}
