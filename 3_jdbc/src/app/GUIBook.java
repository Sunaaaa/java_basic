package app;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import dao.BookDAO;
import sevice.BookService;
import sevice.BookServiceImpl;
import valueObject.BookVO;

public class GUIBook {

	BookDAO dao = new BookDAO();
	BookService s = new BookServiceImpl(dao);
	BookVO user = new BookVO("아작스","kimm", 1200);

	Frame f = null;
	TextArea t = null;
	TextField title, price, author;
	Button list, insert;
	
	public GUIBook() {		
		
		f = new Frame("BOOK APP");		
		t = new TextArea(20,20);
		f.add(t,BorderLayout.NORTH);
		
		list = new Button("LIST");
		list.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				List<BookVO> list = s.booklist();
//				list.forEach(t -> System.out.println(t));
				for (BookVO b : list) {
					t.append(b.toString()+"\n");
				}
			}
		});
		
		insert = new Button("INSERT");
		insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					int a = s.addBook(user);
					t.append("추가됨");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		Panel p = new Panel();
		p.add(list);
		p.add(insert);
		f.add(p,BorderLayout.SOUTH);
		
		f.setSize(400, 400);
		f.setVisible(true);
		

		
	}

	
	public static void main(String[] args) {
		new GUIBook();

	}

}
