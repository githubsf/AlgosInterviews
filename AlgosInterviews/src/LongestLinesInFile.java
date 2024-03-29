import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Comparator;
	import java.util.Set;
	import java.util.TreeSet;
	
public class LongestLinesInFile {
		
	 
	    public static void main(String[] args) {
	         
	        BufferedReader br = null;
	        //String filePath = args[0];
	        String filePath = new String("C:/users/anoosh/desktop/Development/MyTestFile.txt");
	        int topList = 0;
	        Set<Entries> liSet = new TreeSet<Entries>(new MyComp());
	        try {
	            br = new BufferedReader(new FileReader(new File(filePath)));
	            String line = br.readLine();
	           // topList = Integer.parseInt(line.trim()); 
	            //requires the input file to have its 1st line contain an int
	            topList=1; //only print the longest line, 2 would print the 2 longest lines.
	            while((line = br.readLine()) != null){
	                line = line.trim();
	                if(!"".equals(line)){
	                    liSet.add(new Entries(line.length(), line));
	                }
	            }
	            int count = 0;
	            for(Entries ent:liSet){
	                System.out.println(ent.line);
	                if(++count == topList){
	                    break;
	                }
	            }
	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
	 
	    public static class Entries{
	        Integer length;
	        String line;
	        public Entries(Integer l,String line){
	            length = l;
	            this.line = line;
	        }
	    }
	     
	    public static class MyComp implements Comparator<Entries>{
	 
	        @Override
	        public int compare(Entries e1, Entries e2) {
	            if(e2.length > e1.length){
	                return 1;
	            } else {
	                return -1;
	            }
	        }
	         
	    }
	

}
