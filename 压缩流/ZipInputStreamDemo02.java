import java.io.File ;
import java.io.OutputStream ;
import java.io.InputStream ;
import java.util.zip.ZipEntry ;
import java.util.zip.ZipFile ;
import java.util.zip.ZipInputStream ;
import java.io.FileInputStream ;
import java.io.FileOutputStream ;
public class ZipInputStreamDemo02{
	public static void main(String args[]) throws Exception{	// �����쳣�׳�
		File file = new File("d:" + File.separator + "mldndir.zip") ;	// ����ѹ���ļ�����
		File outFile = null ;	// ����ļ���ʱ��Ҫ���ļ��еĲ���
		ZipFile zipFile = new ZipFile(file) ;	// ʵ����ZipFile����
		ZipInputStream zipInput = null ;	// ����ѹ��������
		OutputStream out = null ;	// ������������������ÿһ��ʵ������
		InputStream input = null ;	// ��������������ȡÿһ��ZipEntry
		ZipEntry entry = null ;	// ÿһ��ѹ��ʵ��
		zipInput = new ZipInputStream(new FileInputStream(file)) ;	// ʵ����ZIpInputStream
		while((entry = zipInput.getNextEntry())!=null){	// �õ�һ��ѹ��ʵ��
			System.out.println("��ѹ��" + entry.getName() + "�ļ���") ;
			outFile = new File("d:" + File.separator + entry.getName()) ;	// ����������ļ�·��
			if(!outFile.getParentFile().exists()){	// �������ļ��в�����
				outFile.getParentFile().mkdir() ;	// �����ļ���
			}
			if(!outFile.exists()){	// �ж�����ļ��Ƿ����
				outFile.createNewFile() ;	// �����ļ�
			}
			input = zipFile.getInputStream(entry) ;	// �õ�ÿһ��ʵ���������
			out = new FileOutputStream(outFile) ;	// ʵ�����ļ������
			int temp = 0 ;
			while((temp=input.read())!=-1){
				out.write(temp) ;
			}
			input.close() ;		// �ر�������
			out.close() ;	// �ر������
		}
		input.close() ;
	}
};