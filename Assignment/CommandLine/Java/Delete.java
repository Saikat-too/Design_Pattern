package Assignment.CommandLine.Java;


    class Delete implements Command {
        private String name;
    
        public Delete(String name) {
            this.name = name;
        }
        
    @Override
    public void execute(){
        System.out.println("Deleting " + name);
    }
    }

       

