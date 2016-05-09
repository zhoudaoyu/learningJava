package myJava;

import java.io.*;

public class FileInput {
	private File file = null;
	
	public FileInput(File file){
		this.file = file;
	}
	
	public File getFile(){
		return this.file;
	}
	
	public void setFile(File file){
		this.file = file;
	}
	
	public void readFileByChar(File file){
		String s = null;
		Reader fr = null;
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader(file));
			while((s = br.readLine()) != null){
				//s += "\n";
				System.out.println(s);
			};
		}
		catch(IOException e){
			System.out.println(e.getStackTrace());
		}
		finally{
			this.closeFile(br);
		}
	}
	
	public void closeFile(Reader rd){
		try {
			rd.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Main Function
	public static void main(String[] args){
		FileInput fi= new FileInput(new File("C:\\Users\\daoyu.zhou\\workspace\\myJava\\src\\myJava\\a.txt"));
		fi.readFileByChar(fi.getFile());
	}
}
