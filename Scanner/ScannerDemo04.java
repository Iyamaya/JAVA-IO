import java.util.* ;
import java.text.* ;
public class ScannerDemo04{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in) ;	// �Ӽ��̽�������
		String str = null ;
		Date date = null ;
		System.out.print("�������ڣ�yyyy-MM-dd����") ;
		if(scan.hasNext("^\\d{4}-\\d{2}-\\d{2}$")){	// �ж�
			str = scan.next("^\\d{4}-\\d{2}-\\d{2}$") ;	// ����
			try{
				date = new SimpleDateFormat("yyyy-MM-dd").parse(str) ;
			}catch(Exception e){}
		}else{
			System.out.println("��������ڸ�ʽ����") ;
		}
		System.out.println(date) ;
	}
};