package homework;

import java.util.Scanner;

public class MemberService { // 일하는 클래스
	// menu(),insert(),delete()
	private MemberDTO[] ar = new MemberDTO[5];
// 필드x 메소드만 설정.
// 탈퇴 - 배열 값을 null 해주면 된다. 가비지 메모리는 삭제된다.
// 남은 자리수 할때 if.

	public void menu() { // 일단 번호만 받는거부터 구현.
		for (;;) {
			System.out.println(
				"************************\n"
			+		"\t1. 입력\n"
			+		"\t2. 출력\n"
			+		"\t3. 수정\n"
			+		"\t4. 탈퇴\n"
			+		"\t5. 끝내기\n"
			+	"************************");
			Scanner scan = new Scanner(System.in);

			System.out.print("\t\t메뉴 : ");
			int a = scan.nextInt();
			System.out.println();

			if (a == 1)
				insert();
			else if (a == 2)
				list();
			else if (a == 3)
				update();
			else if (a == 4)
				delete();
			else if (a == 5)
				break;
			else
				System.out.println("다시 입력하세요.\n");

		}
	}

	// insert()-----------------------------------------------------------------
	// 배열을 한바퀴 돌면서 null 있으면 인스턴스 생성. 마지막번호까지 null이 없으면 자리없음 알림.
	private void insert() {
		int a = ar.length;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				a--;
				if (a == 0) {
					System.out.println(ar.length + "명의 정원이 찼습니다.\n");
					return; // void 임에도 return을 쓰면 메소드를 나간다.
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null) {
				System.out.println("회원 등록을 시작합니다.\n");
				ar[i] = new MemberDTO();
				a--;
				System.out.println("1 row created");
				if (a == 0)
					System.out.println("더 이상 등록할수 없습니다.");
				else
					System.out.println(a + "자리 남았습니다.");
				System.out.println();
				break;
			}
		}
	}

	// list------------------------------------------------------------------------------
	// ar[i]가 null이 아니라면, 출력. null이라면 x++, x=ar.length 라면 회원이없습니다.
	private void list() {
		System.out.println("회원 명단\n\n이름\t나이\t휴대폰\t주소");
		int x = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				ar[i].showInfo();
			} else {
				x++;
				continue;
			}
			System.out.println();
		}
		if (x == ar.length)
			System.out.println("\n회원이 없습니다.\n");
	}

	// update------------------------------------------------------------------------------
	// 일치하는 전화번호를 탐색하고, 일치하면 데이터를 수정, 일치하지않으면
	private void update() {
		System.out.println("회원정보를 수정합니다.\n");

		Scanner scan = new Scanner(System.in);

		System.out.print("전화번호를 입력하세요 : ");
		int i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getPhone().equals(scan.next())) {

				ar[i].showInfo();
				System.out.print("수정 할 이름 :");
				ar[i].setName(scan.next());
				System.out.print("수정 할 핸드폰 :");
				ar[i].setPhone(scan.next());
				System.out.print("수정 할 주소 : ");
				ar[i].setAddress(scan.next());

				System.out.println("\n1 row(s) updated\n");
			}
		}
		if (i == ar.length)
			System.out.println("\n찾는 회원이 없습니다.\n");
	}

	// delete-------------------------------------------------------------------------
	private void delete() {
		System.out.println("회원탈퇴를 진행합니다.");
		Scanner scan = new Scanner(System.in);

		System.out.print("전화번호를 입력하세요 : ");
		int i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getPhone().equals(scan.next())) {

				ar[i] = null;
				System.out.println("\n1 row(s) deleted\n");
			}
		}
		if (i == ar.length)
			System.out.println("\n찾는 회원이 없습니다.\n");
	}
}