import java.io.File ;
import java.io.FileInputStream ;
import java.io.InputStream ;
import java.util.zip.ZipEntry ;
import java.util.zip.ZipInputStream ;
import java.io.FileInputStream ;
public class ZipInputStreamDemo01{
	public static void main(String args[]) throws Exception{	// �����쳣�׳�
		File zipFile = new File("d:" + File.separator + "mldn.zip") ;	// ����ѹ���ļ�����
		ZipInputStream input = null ;	// ����ѹ��������
		input = new ZipInputStream(new FileInputStream(zipFile)) ;	// ʵ����ZIpInputStream
		ZipEntry entry = input.getNextEntry() ;	// �õ�һ��ѹ��ʵ��
		System.out.println("ѹ��ʵ�����ƣ�" + entry.getName()) ;
		input.close() ;
	}
};