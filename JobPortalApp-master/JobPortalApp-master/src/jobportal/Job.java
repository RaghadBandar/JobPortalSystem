/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobportal;

/**
 *
 * @author razanalsudairi
 */
public class Job {
    
    private String JobName;
    private int JobID;
    private String  JobDescription;
    private boolean JobState;
    private String JobMajor;
    

    public Job(){}
    public Job( String  JobName , int JobID , String JobDescription  , boolean JobState  ,String  JobMajor){
        this.JobName=JobName;
        this.JobID= JobID;
        this.JobDescription=JobDescription;
        this.JobState=JobState;
        this.JobMajor=JobMajor;
    }

    public String getJobName() {
        return JobName;
    }
    public int getJobID() {
        return JobID;
    }
    public String getJobDescription() {
        return JobDescription;
    }
    public boolean getJobState() {
        return JobState;
    }
    public String getJobMajor() {
        return JobMajor;
    }
    public void setJobName(String JobName) {
        String newJobName = null;
        this.JobName =newJobName;
    }
    public void setJobID(int JobID) {
        int newJobID = 0;
        this.JobID = newJobID;
    }
    public void setJobDescription(String JobDescription) {
        String newJobDescription = null;
           this.JobDescription = newJobDescription;
    }
    public boolean setJobState(int JobState) {
        boolean newJobState = false;
        this.JobState = newJobState;
        return false;
    }
    public void setJobMajor(String JobMajor) {
        String newJobMajor = null;
        this.JobMajor = newJobMajor;
    }
    
}
