import java.io.File ;
import java.io.IOException ;
import java.io.FileOutputStream ;
import java.io.OutputStream ;
import java.io.ObjectOutputStream ;
import java.io.FileInputStream ;
import java.io.InputStream ;
import java.io.ObjectInputStream ;
public class SerDemo05{
	public static void main(String args[]) throws Exception{
		Person per[] = {new Person("����",30),new Person("����",31),
			new Person("����",32)} ;
		ser(per) ;
		Object o[] = (Object[])dser() ;
		for(int i=0;i<o.length;i++){
			Person p = (Person)o[i] ;
			System.out.println(p) ;
		}
	}
	public static void ser(Object obj[]) throws Exception {
		File f = new File("D:" + File.separator + "test.txt") ;	// ���屣��·��
		ObjectOutputStream oos = null ;	// �������������
		OutputStream out = new FileOutputStream(f) ;	// �ļ������
		oos = new ObjectOutputStream(out) ;
		oos.writeObject(obj) ;	// �������
		oos.close() ;	// �ر�
	}
	public static Object[] dser() throws Exception {
		File f = new File("D:" + File.separator + "test.txt") ;	// ���屣��·��
		ObjectInputStream ois = null ;	// ��������������
		InputStream input = new FileInputStream(f) ;	// �ļ�������
		ois = new ObjectInputStream(input) ;	// ʵ��������������
		Object obj[] = (Object[])ois.readObject() ;	// ��ȡ����
		ois.close() ;	// �ر�
		return obj ;
	}
};