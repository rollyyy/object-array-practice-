package com.greedy.level02.normal.product.manager;

import java.util.Scanner;

import com.greedy.level02.normal.product.model.dto.ProductDTO;

public class ProductManager {
		
	

	private ProductDTO[] pro = null;
	public static int count = 0;
	
	Scanner sc = new Scanner(System.in);
	
	{
		pro = new ProductDTO[10];
	}
	
	public void mainMenu() {
		int menu = 0;
		
		do {
			System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("9. 프로그램 종료");
			System.out.print("선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: productInput(); break;
			case 2: productPrint(); break;
			case 9: System.out.println("프로그램을 종료합니다."); break;
			default: System.out.println("잘못 선택하셨습니다."); break;
			}
			
		}while(menu != 9);
	}
	

	public void productInput() {
		
		System.out.print("제품 번호 : ");
		int pId = sc.nextInt();
		sc.nextLine();
		
		System.out.print("제품명 : ");
		String pName = sc.nextLine();
		
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		pro[count] = new ProductDTO(pId, pName, price, tax);
		
	}
	
	public void productPrint() {
		for(int i = 0; i < count; i++) {
			System.out.println(pro[i].information());
		}
	}
	
	
	}
	
	

