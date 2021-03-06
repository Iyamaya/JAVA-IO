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
		Person per[] = {new Person("张三",30),new Person("李四",31),
			new Person("王五",32)} ;
		ser(per) ;
		Object o[] = (Object[])dser() ;
		for(int i=0;i<o.length;i++){
			Person p = (Person)o[i] ;
			System.out.println(p) ;
		}
	}
	public static void ser(Object obj[]) throws Exception {
		File f = new File("D:" + File.separator + "test.txt") ;	// 定义保存路径
		ObjectOutputStream oos = null ;	// 声明对象输出流
		OutputStream out = new FileOutputStream(f) ;	// 文件输出流
		oos = new ObjectOutputStream(out) ;
		oos.writeObject(obj) ;	// 保存对象
		oos.close() ;	// 关闭
	}
	public static Object[] dser() throws Exception {
		File f = new File("D:" + File.separator + "test.txt") ;	// 定义保存路径
		ObjectInputStream ois = null ;	// 声明对象输入流
		InputStream input = new FileInputStream(f) ;	// 文件输入流
		ois = new ObjectInputStream(input) ;	// 实例化对象输入流
		Object obj[] = (Object[])ois.readObject() ;	// 读取对象
		ois.close() ;	// 关闭
		return obj ;
	}
};