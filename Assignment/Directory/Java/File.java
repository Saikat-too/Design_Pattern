package Assignment.Directory.Java;

public class File implements Storage {

    private String filename;
    private long size ;

    public File(String filename, int size) {
        this.filename = filename;
        this.size = size;

        
    }

    @Override
    public long size() {
        System.out.println("File " + filename + ", size: " + size);
		return size;
    }
    
}
