package day09_inner;
import javax.swing.JOptionPane;

import day09.Command;

public class Test03 {
	public static void main(String[] args) {
		Command delete = ()->System.out.println("delete");
		Command update = ()->System.out.println("update");
		Command list = ()->System.out.println("list");
		Command create = ()->System.out.println("create");
		
		delete.exec();
		list.exec();
		
		
		/*
		 * Command delete = new Command() {
		 * 
		 * @Override public void exec() { // TODO Auto-generated method stub
		 * System.out.println("delete 작업 수행"); } };
		 * 
		 		
		Command update = new Command() {

			@Override
			public void exec() {
				// TODO Auto-generated method stub
				System.out.println("update 작업 수행");
			}
		};

		Command list = new Command() {

			@Override
			public void exec() {
				// TODO Auto-generated method stub
				System.out.println("list 작업 수행");
			}
		};

		Command create = new Command() {

			@Override
			public void exec() {
				// TODO Auto-generated method stub
				System.out.println("create 작업 수행");
			}
		};
*/

	}
}
