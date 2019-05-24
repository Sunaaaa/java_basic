package day09_inner;

import javax.swing.JOptionPane;

/*interface Command {
	void exec();
	default public void process() {
		System.out.println("process()");
	}
}*/
import day09.Command;

public class Test02 {
	public static void main(String[] args) {

		Command delete = new Command() {

			@Override
			public void exec() {
				// TODO Auto-generated method stub
				System.out.println("delete 작업 수행");
			}
		};

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

		String msg = JOptionPane.showInputDialog("수행할 명령을 입력하세요. \n create/list/delete/update");

		switch (msg.trim().toLowerCase()) {
		case "delete":
			delete.exec();
			break;
		case "create":
			create.exec();
			break;
		case "update":
			update.exec();
			break;
		case "list":
			list.exec();
			break;
		default:
			System.out.println("다시 입력하세요!");
		}
	}
}
