import java.util.* ;
import java.text.* ;
import java.io.* ;
public class ScannerDemo05{
	public static void main(String args[]){
		File f = new File("D:" + File.separator + "test.txt") ;	// ָ�������ļ�
		Scanner scan = null ;
		try{
			scan = new Scanner(f) ;	// �Ӽ��̽�������
		}catch(Exception e){}
		StringBuffer str = new StringBuffer() ;
		while(scan.hasNext()){
			str.append(scan.next()).append('\n')	;	//	ȡ����
		}
		System.out.println("�ļ�����Ϊ��" + str) ;
	}
};