package com.classNumber;

import java.util.Scanner;

public class class_avg {
	public static void main(String[] args) {
	int classnumber=10;
	int stunumber=10;
	double sum=0;
	double avg=0;
	Scanner input=new Scanner(System.in);
	for(int i=1;i<=10;i++){
		System.out.println(i+"��ĵ��Ƴɼ�");
		sum=0;
		for(int j=1;j<=10;j++){
			System.out.println("�������"+j+"��ѧ���ĳɼ�(��Ч��Χ0~100)");
			double sore=input.nextInt();
			sum+=sore;
		}
		avg=sum/stunumber;
		System.out.println("�ð༶��ƽ������Ϊ:"+avg);
	}
}
}
