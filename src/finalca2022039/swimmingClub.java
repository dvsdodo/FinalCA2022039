/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalca2022039;

import Staff.Departments;
import Staff.StaffType;
import Staff.staff;
import Staff.staffFactory;
import Swimmers.SwimmerFactory;
import Swimmers.Swimmers;
import SwimmingGroup.*;
import java.util.ArrayList;

/**
 *
 * @author dvsdo
 */
public class swimmingClub {
    
    private ArrayList<SwimmingGroups> swimmingList;
    private ArrayList<Staff.staff> staffList;
    private ArrayList<Swimmers> swimmersList;
    
    public swimmingClub() {
        
        this.swimmersList = new ArrayList<Swimmers>();
        createSwimmer(100);
        this.swimmingList = new ArrayList<SwimmingGroups>();
        groupSwimmer(50);
        this.staffList = new ArrayList<staff>();
        Menu askNumClubStaff = new Menu();
        Menu askNumCoaching = new Menu();
       // int total;
        //createClubStaff(askNumClubStaff.askClubStaff());
       // createCoaching(askNumCoaching.askCoaching());
     
        createStaff(askNumCoaching.askCoaching(), askNumClubStaff.askClubStaff());
    }
    
    public static void main(String[] args) {
        
        Menu myMenu = new Menu();
        swimmingClub mySC = new swimmingClub();
        int option = myMenu.askoptions();
        
        System.out.println(" Staff List\n");        
        switch (option) {
            case 1:
                //System.out.println(mySC.listAllClubStaff());
                System.out.println(mySC.listAllStaff());
                break;
            case 21:
                System.out.println(mySC.listAllClubStaff());
                break;
            case 22:
                System.out.println(mySC.listAllCoaching());
                break;
            case 3:
                System.out.println(mySC.listALLGroups());
                break;
            case 41:
                System.out.println(mySC.listAllBaby());
                break;
            case 42:
                System.out.println(mySC.listAllChild());
                break;
            case 43:
                System.out.println(mySC.listAllKid());
                break;
            case 44:
                System.out.println(mySC.listAllTeenager());
                break;
            case 45:
                System.out.println(mySC.listAllAdult());
                break;
            case 46:
                System.out.println(mySC.listAllExperient());
                break;
            case 47:
                System.out.println(mySC.listAllElder());
                break;
            case 51:
                System.out.println(mySC.listSunday());
                break;
            case 52:
                System.out.println(mySC.listMonday());
                break;
            case 53:
                System.out.println(mySC.listTuesday());
                break;
            case 54:
                System.out.println(mySC.listWednesday());
                break;
            case 55:
                System.out.println(mySC.listThursday());
                break;
            case 56:
                System.out.println(mySC.listFriday());
                break;
            case 57:
                System.out.println(mySC.listSaturday());
                break;
            case 61:
                System.out.println(mySC.listAllSwimmersBaby());
                break;
            case 62:
                System.out.println(mySC.listAllSwimmersChild());
                break;
            case 63:
                System.out.println(mySC.listAllSwimmersKid());
                break;
            case 64:
                System.out.println(mySC.listAllSwimmersTeenager());
                break;
            case 65:
                System.out.println(mySC.listAllSwimmersAdult());
                break;
            case 66:
                System.out.println(mySC.listAllSwimmersExperient());
                break;
            case 67:
                System.out.println(mySC.listAllSwimmersElder());
                break;
            
            case 8:
                System.out.println(mySC.listAllSwimmer());
                break;
         
        default:System.out.println("Print Error!!");
        }

    }
    
    /**
     * Generate a number of random swimmer group
     * @param numGroup - the number of swimmer group
     */
    private void groupSwimmer(int numGroup){
        
        GroupFactory myGF = new GroupFactory();
        
        for (int i=0; i < numGroup; i++){
            SwimmingGroups group = myGF.getSwimmerGroup();
            this.swimmingList.add(group);
        }
    }

    /**
     * Generate a number of random Swimmers
     * @param numSwimmer - the number of swimmers 
     */
    private void createSwimmer (int numSwimmer) {
        SwimmerFactory mySW = new SwimmerFactory();
        
        for (int i=0; i < numSwimmer; i++){
            Swimmers swimmer = mySW.getSwimmer();
            this.swimmersList.add(swimmer);
        }
            
    }
        
     /*   private void createClubStaff (int numStaff) {
            staffFactory mySF = new staffFactory();
        
            for (int i=0; i<numStaff; i++) {
                staff newStaff = mySF.getStaff(Departments.CLUBSTAFF);
            this.staffList.add(newStaff);
            }
        }
    
        private void createCoaching (int numStaff) {
            staffFactory mySF = new staffFactory();
        
            for (int i=0; i<numStaff; i++) {
                staff newStaff = mySF.getStaff(Departments.COACHING);
            this.staffList.add(newStaff);
            }
    }*/
        
    /**
     * Generate a number of random Staffs
     * @param numStaff - the numbers of coaching 
     * @param numStaff2 - the numbers of Club Staff
     */
    private void createStaff (int numStaff, int numStaff2) {
        
        staffFactory mySF = new staffFactory();
        int j=0;
        for (int i=0; i<numStaff; i++) {
            staff newStaff = mySF.getStaff(Departments.COACHING);
            if ((newStaff.getRole() == StaffType.valueOf("HEADCOACH"))&&(j == 0)){
                this.staffList.add(newStaff);
                j++;
            }else if (newStaff.getRole() != StaffType.valueOf("HEADCOACH")){
                this.staffList.add(newStaff);
            }else {
                i--;
            }
        }
        
        for (int i =0; i<numStaff2; i++) {
            staff newStaff = mySF.getStaff(Departments.CLUBSTAFF);
            this.staffList.add(newStaff);
            //j++;
        }
    }

    /**
     * Generate a formatted String that contains all staff details
     * @return the formatted String
     */
    public String listAllStaff(){
        String list = "";
        for (staff s: staffList) {
            list = list.concat(s.toString());
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all swimmer details
     * @return the formatted String
     */
    public String listAllSwimmer() {
        String list = "";
        for (Swimmers s: swimmersList) {
            list = list.concat(s.toString());
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all club staff details
     * @return the formatted String
     */
    public String listAllClubStaff(){
        String list = "";

        for (staff s: staffList) {
            
            if((s.getRole() == StaffType.valueOf("CLEANER")) || (s.getRole() == StaffType.valueOf("CARETAKER")) || (s.getRole() == StaffType.valueOf("RECEPTIONIST"))) { 
            list = list.concat(s.toString());
            }
        }
        return list;
    }
        
    /**
     * Generate a formatted String that contains all coaching details
     * @return the formatted String
     */
    public String listAllCoaching(){
        String list = "";

        for (staff s: staffList) {
            
            if((s.getRole() == StaffType.valueOf("HEADCOACH")) || (s.getRole() == StaffType.valueOf("ASSISTANTCOACH")) || (s.getRole() == StaffType.valueOf("SWIMTEACHER"))) { 
            list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all group details
     * @return the formatted String
     */
    public String listALLGroups(){
        String list= "";
        
        for(SwimmingGroups p: swimmingList) {
            list = list.concat(p.toString());
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all group type = 
     * @return the formatted String
     */
    public String listAllBaby() {
        String list = "";
        
        for (SwimmingGroups s: swimmingList ){
            
            if (s.getGroup() == GroupType.BABY) {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all group type = Child
     * @return the formatted String
     */
    public String listAllChild() {
        String list = "";
        
        for (SwimmingGroups s: swimmingList ){
            
            if (s.getGroup() == GroupType.CHILD) {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all group type = Kid
     * @return the formatted String
     */
    public String listAllKid() {
        String list = "";
        
        for (SwimmingGroups s: swimmingList ){
            
            if (s.getGroup() == GroupType.KID) {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all group type = Teenager
     * @return the formatted String
     */
    public String listAllTeenager() {
        String list = "";
        
        for (SwimmingGroups s: swimmingList ){
            
            if (s.getGroup() == GroupType.TEENAGER) {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all group type = Adult
     * @return the formatted String
     */
    public String listAllAdult() {
        String list = "";
        
        for (SwimmingGroups s: swimmingList ){
            
            if (s.getGroup() == GroupType.ADULT) {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all group type = Experient
     * @return the formatted String
     */
    public String listAllExperient() {
        String list = "";
        
        for (SwimmingGroups s: swimmingList ){
            
            if (s.getGroup() == GroupType.EXPERIENT) {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all group type = Elder
     * @return the formatted String
     */
    public String listAllElder() {
        String list = "";
        
        for (SwimmingGroups s: swimmingList ){
            
            if (s.getGroup() == GroupType.ELDER) {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all Day of Week = Sunday
     * @return the formatted String
     */
    public String listSunday () {
        String list = "";
        
        for (SwimmingGroups s: swimmingList) {
            if (s.getDayWeek() == "Sunday") {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all Day of Week = Monday
     * @return the formatted String
     */
    public String listMonday () {
        String list = "";
        
        for (SwimmingGroups s: swimmingList) {
            if (s.getDayWeek() == "Monday") {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all Day of Week = Tuesday
     * @return the formatted String
     */
    public String listTuesday () {
        String list = "";
        
        for (SwimmingGroups s: swimmingList) {
            if (s.getDayWeek() == "Tuesday") {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all Day of Week = Wednesday 
     * @return the formatted String
     */
    public String listWednesday () {
        String list = "";
        
        for (SwimmingGroups s: swimmingList) {
            if (s.getDayWeek() == "Wednesday") {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all Day of Week = Thursday 
     * @return the formatted String
     */
    public String listThursday () {
        String list = "";
        
        for (SwimmingGroups s: swimmingList) {
            if (s.getDayWeek() == "Thursday") {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all Day of Week = Friday
     * @return the formatted String
     */
    public String listFriday () {
        String list = "";
        
        for (SwimmingGroups s: swimmingList) {
            if (s.getDayWeek() == "Friday") {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all Day of Week = Saturday
     * @return the formatted String
     */
    public String listSaturday () {
        String list = "";
        
        for (SwimmingGroups s: swimmingList) {
            if (s.getDayWeek() == "Saturday") {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all Swimmers by particular group = Baby
     * @return the formatted String
     */
    public String listAllSwimmersBaby() {
        String list = "";
        
        for (Swimmers s: swimmersList){
            
            if (s.getGroup() == GroupType.BABY) {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all Swimmers by particular group = Kid
     * @return the formatted String
     */
    public String listAllSwimmersKid() {
        String list = "";
        
        for (Swimmers s: swimmersList){
            
            if (s.getGroup() == GroupType.KID) {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all Swimmers by particular group = Teenager
     * @return the formatted String
     */
    public String listAllSwimmersTeenager() {
        String list = "";
        
        for (Swimmers s: swimmersList){
            
            if (s.getGroup() == GroupType.TEENAGER) {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all Swimmers by particular group = Adult
     * @return the formatted String
     */
    public String listAllSwimmersAdult() {
        String list = "";
        
        for (Swimmers s: swimmersList){
            
            if (s.getGroup() == GroupType.ADULT) {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all Swimmers by particular group = Experient
     * @return the formatted String
     */
    public String listAllSwimmersExperient() {
        String list = "";
        
        for (Swimmers s: swimmersList){
            
            if (s.getGroup() == GroupType.EXPERIENT) {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all Swimmers by particular group = Elder
     * @return the formatted String
     */
    public String listAllSwimmersElder() {
        String list = "";
        
        for (Swimmers s: swimmersList){
            
            if (s.getGroup() == GroupType.ELDER) {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
    
    /**
     * Generate a formatted String that contains all Swimmers by particular group = Child
     * @return the formatted String
     */
    public String listAllSwimmersChild() {
        String list = "";
        
        for (Swimmers s: swimmersList){
            
            if (s.getGroup() == GroupType.CHILD) {
                list = list.concat(s.toString());
            }
        }
        return list;
    }
}