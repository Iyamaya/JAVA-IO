import java.io.File ;
import java.io.IOException ;
public class FileDemo07{
	public static void main(String args[]){
		File f = new File("d:"+File.separator+"mldn") ;		// ʵ����File��Ķ���
		f.mkdir() ;	// �����ļ���
	}
};