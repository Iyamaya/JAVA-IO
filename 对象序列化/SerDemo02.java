import java.io.File ;
import java.io.FileInputStream ;
import java.io.InputStream ;
import java.io.ObjectInputStream ;
public class SerDemo02{
	public static void main(String args[]) throws Exception {
		File f = new File("D:" + File.separator + "test.txt") ;	// ���屣��·��
		ObjectInputStream ois = null ;	// ��������������
		InputStream input = new FileInputStream(f) ;	// �ļ�������
		ois = new ObjectInputStream(input) ;	// ʵ��������������
		Object obj = ois.readObject() ;	// ��ȡ����
		ois.close() ;	// �ر�
		System.out.println(obj) ;
	}
};