
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab09 {
    //Change the name of input and output file based on practical paper
    String inputFile = "input.txt";
    String outputFile = "output.txt";

    //--VARIABLES - @STUDENT: DECLARE YOUR VARIABLES HERE:
	int n;
        ArrayList<String> testCaseList;
       ArrayList<String> S = new ArrayList<>();
       ArrayList<Carp> carp = new ArrayList<>();
       String result = "";



	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART--------------------------    
    String fi, fo;
    
    /**
     * Set input and output file for automatic rating
     * @param args path of input file and path of output file
     */
    public void setFile (String[] args){
        fi = args.length>=2? args[0]: inputFile;
        fo = args.length>=2? args[1]: outputFile;
    }
    
    /**
     * Reads data from input file
     */
    public void read(){
        try (Scanner sc  = new Scanner(new File(fi))){
    //--END FIXED PART----------------------------

            //INPUT - @STUDENT: ADD YOUR CODE FOR INPUT HERE:
            n = Integer.parseInt(sc.nextLine());
            
            testCaseList = new ArrayList<>();
            String testCase = "";
            for(int i = 0; i < n; i++ ){
                testCase = sc.nextLine();
                testCaseList.add(testCase);
            }
            System.out.println("SUCCESS");


	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART--------------------------    
            sc.close();
        }catch(FileNotFoundException ex){
            System.out.println("Input Exception # " + ex);
        }
    }
    //--END FIXED PART----------------------------
    
    //ALGORITHM - @STUDENT: ADD YOUROWN METHODS HERE (IF NEED):
    

    
	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART--------------------------    
    /**
     * Main algorithm
     */
    public void solve(){
    //--END FIXED PART----------------------------

        //ALGORITHM - @STUDENT: ADD YOUR CODE HERE:
        Scanner sc = new Scanner(System.in);
        String[] testCasePart;
        String commandType;
        String[] wtestCasePart;
         String wcommandType;
         MyCarp mc= new MyCarp();
        
        
         
        for(String testCase : testCaseList){
           testCasePart = testCase.split(" ");
           commandType = testCasePart[0];
          
                
            
           switch (commandType){
               case "Carp":{
                   String State = testCasePart[1];
                   int pond = Integer.parseInt(testCasePart[2]);
                   Carp c = new Carp(State, pond);
                   carp.add(c);
                   System.out.println("Carp");
                 break;  
               }
               case "Print" :{
                   result += "---Print---\n";
                   for ( Carp ca : carp){
                       result += ca.printData()+" , ";
                   }
                  break;
               }
               case "F1":{
                   result += "---F1---\n";
                   int a = mc.f1(carp);
                   result += String.format("%d\n",a);
                   result += "---\n";
                    System.out.println("F1");
                   break;
               }
               case "F2": {
                   result += "---F2---\n";
                   result += "Before Updating: " ;
                   for ( Carp ca : carp){
                       result += ca.printData()+" , ";
                   }
                   result += "\n";
               result +=  "After Updating: ";
               mc.f2(carp);
               for ( Carp ca : carp){
                       result += ca.printData()+" , ";
               }
               result   += "\n" ;
                   System.out.println("F2");
               break;
                   }
               case "F3":{
                        result += "---F3---\n";
                   result += "Beforre Sorting: ";
                   
                   for ( Carp ca : carp){
                       result += ca.printData()+" , ";
                   }
                   result += "\n";
                   mc.f3(carp);
                   for ( Carp ca : carp){
                       result += ca.printData()+" , ";
                   }
                   result += "\n";
                    System.out.println("F3");
                   break;
               }
           
           }
            
               
              
       }
        


	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART-------------------------- 
    }
    
    /**
     * Write result into output file
     */
    public void printResult(){
	    try{
            FileWriter fw = new FileWriter(fo);
	//--END FIXED PART----------------------------
                
        	//OUTPUT - @STUDENT: ADD YOUR CODE FOR OUTPUT HERE:
                
                    fw.write(result);
                
           
                


	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART-------------------------- 
            fw.flush();
            fw.close();
        }catch (IOException ex){
            System.out.println("Output Exception # " + ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lab09 q = new Lab09();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
	//--END FIXED PART----------------------------    
}
