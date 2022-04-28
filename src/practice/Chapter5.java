package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Chapter5 {

	public static void main(String[]args) {
	
		
		List<Task>taskList = new ArrayList<>();
		taskList.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う"));
		taskList.add(new Task(LocalDate.of(2021,9,15), "○○社面接"));
		taskList.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う"));
		taskList.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く"));
		taskList.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く"));
		
		
		taskList.sort((o1,o2) -> o1.getDate().compareTo(o2.getDate()));
		
		for(int i = 0; i < taskList.size(); i ++) {
			System.out.println(taskList.get(i).getDate() + ":" + taskList.get(i).getTask());
			
		}
			
	}
	
}
