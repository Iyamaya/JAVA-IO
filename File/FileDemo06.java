import java.io.File ;
import java.io.IOException ;
public class FileDemo06{
	public static void main(String args[]){
		File f = new File("d:"+File.separator+"test.txt") ;		// ʵ����File��Ķ���
		if(f.exists()){	// ����ļ�������ɾ��
			f.delete() ;	// ɾ���ļ�
		}else{
			try{
				f.createNewFile() ;		// �����ļ������ݸ�����·������
			}catch(IOException e){
				e.printStackTrace() ;	// ����쳣��Ϣ
			}
		}
	}
};