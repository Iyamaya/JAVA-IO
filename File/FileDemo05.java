import java.io.File ;
import java.io.IOException ;
public class FileDemo05{
	public static void main(String args[]){
		File f = new File("d:"+File.separator+"test.txt") ;		// ʵ����File��Ķ���
		if(f.exists()){	// ����ļ�������ɾ��
			f.delete() ;	// ɾ���ļ�
		}
	}
};