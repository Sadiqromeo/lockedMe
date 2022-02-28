package Locker_package;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class LockedMe {

		static final String projectFilesPath ="D:\\Java clases\\OOPS and Implemenation\\Project";
		static final String errorMessage = "Some error occured. Please contact admin@lockedme.com";
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int ch;	
	
			do
			{
				displayMenu();	
				System.out.println("Enter your choice");
				ch=Integer.parseInt(sc.nextLine());
				
				switch(ch)
				{
					case 1:getAllFiles();
					break;
					case 2:createFiles();
					break;
					case 3:deleteFiles();
					break;
					case 4:searchFile();
					break;
					case 5:System.exit(0);
					break;
					default:System.out.println("Invalid Option");
					break;
				}
						
			}
			while(ch>0);
			
			sc.close();
			
		}
		public static void displayMenu()
		{
			System.out.println("****************");
			System.out.println("\t\tWelcome to LockedMe Developed by Company Lockers Pvt Ltd");
			System.out.println("****************");
			System.out.println("\t\t1. Display all the files");
			System.out.println("\t\t2. Create a file");
			System.out.println("\t\t3. Delete a file");
			System.out.println("\t\t4. Search for a flie");
			System.out.println("\t\t5. Exit");
				
		}
		
		/**
		 * This function will return all the files  from the project directory
		 */
		public static void getAllFiles()
		{
			try
			{
				File folder = new File(projectFilesPath);
				File[] listOfFiles = folder.listFiles();
				
				if(listOfFiles.length==0)
					System.out.println("No Files exist in the directory");
				else
				{
					for(var I:listOfFiles)
					{
						System.out.println(I.getName());
					}	
				}
			}
			catch (Exception Ex)
			{
				System.out.println("errorMessage");
			}
		}
		
		public static void createFiles()
		{
			try
			{
				Scanner sc = new Scanner(System.in);
				
				String FileName;
				System.out.println("Enter the File");
				FileName = 	sc.nextLine();
				
				
				int linesCount;
				System.out.println("Enter how many lines in the file:");
				linesCount=Integer.parseInt(sc.nextLine());
				
				FileWriter myWriter = new FileWriter(projectFilesPath+"\\"+FileName);
				
				for(int i=1;i<=linesCount;i++)
				{
					System.out.println("Enter the file line");
					myWriter.write(sc.nextLine()+"\n");
				}
				System.out.println("File Created Successfully");
				myWriter.close();
				sc.close();
			}
				catch(Exception Ex)
				{
					System.out.println("errorMessage");
				}
			}
			
		/**
		 * This method will search the file directory
		 */
		
		public static void deleteFiles()
		{
			Scanner sc = new Scanner(System.in);
		
			try
			{
				
				
				String FileName;
				System.out.println("Enter the File to be deleted");
				FileName = 	sc.nextLine();
				
				File file = new File(projectFilesPath+ "\\"+ FileName);
				if(file.exists())
				{
					file.delete();
					System.out.println("File deleted successfully:"+FileName);
				}
				else
					System.out.println("File do not exist");
				
			}
				catch(Exception Ex)
				{
					System.out.println("errorMessage");
				}
				finally
				{
					sc.close();
				}
			}
		/**
		 * This method will delete the file directory
		 */
		public static void searchFile()
		{
			Scanner sc = new Scanner(System.in);
			
			try
			{
				String FileName;
				System.out.println("Enter the final name to be searched:");
				FileName = sc.nextLine();	
				
				File folder = new File(projectFilesPath);
				File[] listOfFiles = folder.listFiles();
				
				LinkedList<String> filenames = new LinkedList<String>();
				
				for(var I :listOfFiles) 
					filenames.add(I.getName());
				
				if(FileName.contains(FileName))
					System.out.println("File is available");
				else
					System.out.println("File is not available");
				
			}
			catch(Exception Ex)
			{
					System.out.println(errorMessage);
			}
			finally
			{
				sc.close();
			}
		}
}

				
				
				
					
		
		
			
			
				
						
			
						
				
					
				
						
				
				
					
			
			
			
	

