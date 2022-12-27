package Staff;

import java.util.ArrayList;

import Exceptions.SearchException;

/**
 *
 * @author Ken
 */
public class StaffUtils {

	private static StaffType[] allStaffTypes;
	
	public StaffUtils() {
		
		allStaffTypes = StaffType.values();
		
	}

	/**
         * 
         * @return a list of all available staff types as a String
         */
	public static String listStaffTypes() {
				
		String allStaff="";
		int counter = 1;
						
					
		for(StaffType s: allStaffTypes) {
						
			allStaff = allStaff.concat(counter + ": " + s.toString() + "\n");
			counter++;
		}
						
		return allStaff;
	}
	
	/**
         * Create a formatted STring that is a list of staff types belonging to a given department
         * @param dept - the Department specified
         * @return formatted String listing staff types
         */
	public static String listTypeByDepartment(Departments dept) {
		
		String typeString ="";
		int count = 1;
		
		for (StaffType s: allStaffTypes) {
			
			if (s.whichDep()== dept) {
				
				typeString = typeString.concat(count + ": " + s.toString() + "\n");
				count++;
			}
		}
		
		return typeString;
	}
	
        /**
         * Filter a list of staff members from a given staff list who belong to a specified department
         * @param staffList - an ArrayList of staffMembers
         * @param dept - the Department specified
         * @return ArrayList containing only staff members from dept
         */
	public static ArrayList<staff> listStaffByDepartment (ArrayList<staff> staffList, Departments dept){
		
		ArrayList<staff> specificList = new ArrayList<staff>();
		
		for(staff s: staffList) {
			
			//only add gthe staff member if they work in the specific department
			if(s.getRole().whichDep()== dept) {
				
				specificList.add(s);
			}
		}
		
		return specificList;
	}
	
	//@return a arraylist of staff members who carry out @param role
	public static ArrayList<staff> listStaffByRole (ArrayList<staff> staffList, StaffType role){
		
		ArrayList<staff> specificList = new ArrayList<staff>();
		
		for(staff s: staffList) {
			
			//only adding the staff member if they work in the specific department
			if(s.getRole() == role) {
				
				specificList.add(s);
			}
		}
		
		return specificList;
	}
	
	//@return a list of STaffMembers from @param staffList that contain the string @param someName 
	//@throw SearchException if no  match found
	public static ArrayList<staff> searchByStaffName(ArrayList<staff> staffList, String someName) throws SearchException {
		
		someName = someName.toLowerCase();
		
		ArrayList<staff> searchResults = new ArrayList<staff>();
		
		for (staff s: staffList) {
			
			if ((s.getfirstName().toLowerCase().contains(someName)) || (s.getSurname().toLowerCase().contains(someName)) ) {
				
				searchResults.add(s);
				
			}
		}
		
		if (searchResults.size() == 0) {
			
			throw new SearchException("No matching name found.");
		}
		else {
			
			return searchResults;
		}
		
	}
	
	
}
