import java.io.File ;
import java.io.IOException ;
public class FileDemo10{
	public static void main(String args[]){
		File f = new File("d:"+File.separator) ;		// ʵ����File��Ķ���
		if(f.isDirectory()){	// �ж��Ƿ���Ŀ¼
			System.out.println(f.getPath() + "·����Ŀ¼��") ;
		}else{
			System.out.println(f.getPath() + "·������Ŀ¼��") ;
		}
	}
};