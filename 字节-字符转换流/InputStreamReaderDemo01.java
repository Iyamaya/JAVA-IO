import java.io.* ;
public class InputStreamReaderDemo01{
	public static void main(String args[]) throws Exception{
		File f = new File("d:" + File.separator + "test.txt") ;	
		Reader reader = null ;
		reader = new InputStreamReader(new FileInputStream(f)) ;	// ���ֽ�����Ϊ�ַ���
		char c[] = new char[1024] ;
		int len = reader.read(c) ;	// ��ȡ
		reader.close() ;	// �ر�
		System.out.println(new String(c,0,len)) ;
	}
};