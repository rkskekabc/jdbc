package hr;

import java.util.List;
import java.util.Scanner;

public class HRMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("검색어>");
		String keyword = scanner.nextLine();
		
		EmployeeDao dao = new EmployeeDao();
		List<EmployeeVo> list = dao.getList(keyword);
		
		for(EmployeeVo vo : list) {
			System.out.println(vo);
		}
		
		scanner.close();
	}
}
