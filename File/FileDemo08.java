import java.io.File ;
import java.io.IOException ;
public class FileDemo08{
	public static void main(String args[]){
		File f = new File("d:"+File.separator) ;		// ʵ����File��Ķ���
		String str[] = f.list() ;	// �г�����Ŀ¼�е�����
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]) ;
		}
	}
};