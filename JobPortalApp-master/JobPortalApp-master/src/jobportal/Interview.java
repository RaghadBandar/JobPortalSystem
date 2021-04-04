package jobportal;

import java.util.Date;

public class Interview {
    public int InterviewID;
    public String InterviewTitle;
    public Date InterviewDate;
    
    //constructor
    public Interview() {}
    
    public Interview(int InterviewID, String InterviewTitle, Date InterviewDate){
    this.InterviewID = InterviewID;
    this.InterviewTitle = InterviewTitle;
    this.InterviewDate = InterviewDate; }
    
           
       //getters 
        public int getInterviewID() {
        return InterviewID; } 
       
        public String getInterviewTitle() {
        return InterviewTitle; }    
    
        public Date getInterviewDate() {
        return InterviewDate; }      
    
    
       // Setters   
        public void setInterviewID(int InterviewID) {
        this.InterviewID = InterviewID; }
    
        public void setInterviewTitle(String InterviewTitle) {
        this.InterviewTitle = InterviewTitle; }

        public void setInterviewDate(Date InterviewDate) {
        this.InterviewDate = InterviewDate; }
    
// override    
    @Override
         public String toString() {
        return  "InterviewID=" + InterviewID + ", InterviewTitle=" + InterviewTitle + ", InterviewDate =" + InterviewDate;}

}
