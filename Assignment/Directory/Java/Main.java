
package Assignment.Directory.Java;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Folder folderRoot = new Folder("folderRoot");
		
		Folder levelOne1st =  new Folder("levelOne1st");
		Folder levelTwo =  new Folder("levelTwo");
		levelTwo.add(new File("File1-levelTwo",10));
		levelTwo.add(new File("File2-levelTwo",20));
		levelTwo.add(new File("File3-levelTwo",30));
		levelOne1st.add(levelTwo);
		
		Folder levelOne2nd =  new Folder("levelOne2nd");
		levelOne2nd.add(new File("File1-levelOne2nd",5));
		levelOne2nd.add(new File("File2-levelOne2nd",10));
		
		folderRoot.add(levelOne1st);
		folderRoot.add(levelOne2nd);
		folderRoot.add(new File("File1-folderRoot",30));
		
		long totalSize = folderRoot.size();
		System.out.println("---------------------------------------------");
		System.out.println("Folder " + folderRoot.getFolderName() + ", total size: " + totalSize);
		System.out.println("---------------------------------------------");
    }
}