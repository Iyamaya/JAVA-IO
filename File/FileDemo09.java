import java.io.File ;
import java.io.IOException ;
public class FileDemo09{
	public static void main(String args[]){
		File f = new File("d:"+File.separator) ;		// ʵ����File��Ķ���
		File files[] = f.listFiles() ;	// �г�ȫ������
		for(int i=0;i<files.length;i++){
			System.out.println(files[i]) ;
		}
	}
};