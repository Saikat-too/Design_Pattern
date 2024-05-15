class Storage:
    def Size(self):
        pass
class File(Storage):
    def __init__(self , name , size):
        self.name = name;
        self.size = size;
    def Size(self):
        return self.size
    def get_name(self):
        return self.name
    
    def get_children(self):
        return None
    
class Folder(Storage):
    def __init__(self , name):
        self.name = name
        self.children = []
    
    def Size(self):
        total_size = 0
        for child in self.children:
            total_size+=child.Size()
        return total_size
    
    def get_name(self):
        return self.name;
    def add(self , component):
        self.children.append(component)
    def remove(self , component):
        self.children.remove(component)
    
    def get_children(self):
        return self.children
    
if __name__ == "__main__":
    root = Folder("root")
    home = Folder("home")
    documents = Folder("documents")
    file1 = File("file1.txt" , 10)
    file2 = File("file2.txt" , 5)
        
    root.add(home)
    home.add(documents) 
    documents.add(file1)
    documents.add(file2)
        
    print("Size of root:" , root.Size())
        
    documents.remove(file1)
        
    print("Size of root after removing text1 : " , root.Size())
        