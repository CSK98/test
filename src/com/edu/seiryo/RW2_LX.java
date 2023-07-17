package com.edu.seiryo;

import java.util.Scanner;

public class RW2_LX {
	public static void main(String[] args) {
		System.out.println("=======欢迎来到迷你版三国杀=======");
		System.out.println("===========================================");
		System.out.println("三国杀是一款以三国题材为背景的桌游");
		System.out.println("迷你版三国杀是一款以Java开发的控制台游戏程序");
		System.out.println("===========================================");
		System.out.println("----武将列表----");
		System.out.println("刘备\t赵云");
		System.out.println("曹操\t夏侯惇");
		System.out.println("孙权\t周瑜");
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要选择的武将名字：");
		String getName = sc.next();
		System.out.println("你选择了" + getName + "进行游戏");
	}
}
