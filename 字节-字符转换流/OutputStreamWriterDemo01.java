import java.io.* ;
public class OutputStreamWriterDemo01{
	public static void main(String args[]) throws Exception	{	// �����쳣�׳�
		File f = new File("d:" + File.separator + "test.txt") ;	
		Writer out = null ;	// �ַ������
		out = new OutputStreamWriter(new FileOutputStream(f)) ;	// �ֽ�����Ϊ�ַ���
		out.write("hello world!!") ;	// ʹ���ַ������
		out.close() ;
	}
};