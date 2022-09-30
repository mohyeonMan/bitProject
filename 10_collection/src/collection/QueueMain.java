package collection;

import java.util.LinkedList;
import static java.lang.System.out;

public class QueueMain {

	public static void main(String[] args) {
		String[] item = { "소나타", "렉스턴", "제규어" };
		LinkedList<String> q = new LinkedList<String>();

		for (String n : item)
			q.offer(n); // 요소추가

		out.println("q의 크기 : "+q.size()+"\n"); // F I F O first in first out
		String data="";							// 선입선출
												// 순서대로 처리할때 사용.
		while ((data = q.poll()) != null) { 	// 가장먼저 들어온 데이터를 꺼내라.
			out.println(data + "삭제!");
			out.println("q의 크기 : " + q.size() + "\n");
		}
	}

}
