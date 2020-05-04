package year2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class year {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		example1<Integer> ex1=Util.<Integer>get(10);
		System.out.println(ex1.num);
		System.out.println(s);
	}
}

class example1<T>{
	public T num;
	public example1(T num) {
		this.num=num;
	}
}

class Util{
	public static <T> example1<T> get(T t){
		example1<T> ex1=new example1(t);
		return ex1;
	}
}
