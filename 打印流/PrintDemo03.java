import java.io.* ;
public class PrintDemo03{
	public static void main(String arg[]) throws Exception{
		PrintStream ps = null ;		// ������ӡ������
		// ���������ʹ��FileOuputStreamʵ��������ζ�����е���������ļ�֮��
		ps = new PrintStream(new FileOutputStream(new File("d:" + File.separator + "test.txt"))) ;
		String name = "���˻�" ;	// �����ַ���
		int age = 30 ;				// ��������
		float score = 990.356f ;	// ����С��
		char sex = 'M' ;			// �����ַ�
		ps.printf("������%s�����䣺%s���ɼ���%s���Ա�%s",name,age,score,sex) ;
		ps.close() ;
	}
};