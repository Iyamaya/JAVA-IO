import java.io.File ;
import java.io.IOException ;
public class FileDemo04{
	public static void main(String args[]){
		File f = new File("d:"+File.separator+"test.txt") ;		// ʵ����File��Ķ���
		f.delete() ;	// ɾ���ļ�
	}
};