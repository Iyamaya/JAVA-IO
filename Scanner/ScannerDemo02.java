import java.util.* ;
public class ScannerDemo02{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in) ;	// �Ӽ��̽�������
		System.out.print("�������ݣ�") ;
		scan.useDelimiter("\n") ;
		String str = scan.next() ;	// ��������
		System.out.println("���������Ϊ��" + str) ;
	}
};