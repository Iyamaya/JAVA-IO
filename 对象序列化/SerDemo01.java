import java.io.File ;
import java.io.FileOutputStream ;
import java.io.OutputStream ;
import java.io.ObjectOutputStream ;
public class SerDemo01{
	public static void main(String args[]) throws Exception {
		File f = new File("D:" + File.separator + "test.txt") ;	// ���屣��·��
		ObjectOutputStream oos = null ;	// �������������
		OutputStream out = new FileOutputStream(f) ;	// �ļ������
		oos = new ObjectOutputStream(out) ;
		oos.writeObject(new Person("����",30)) ;	// �������
		oos.close() ;	// �ر�
	}
};