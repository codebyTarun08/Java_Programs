class Subject{
     private String subId;
     private String subName;
     private int maxMarks;
     private int marksObtain;
     
     public Subject(String subId,String subName,int maxMarks,int marksObtain){
       this.subId=subId;
       this.subName=subName;
       this.maxMarks=maxMarks;
       setmarksObtain(marksObtain);
     }
     public void setmarksObtain(int mark){
        marksObtain=mark;
    }
    public String getsubId(){
        return subId;
    }
    public String getsubName(){
        return subName;
    }
    public int getmaxMarks(){
        return maxMarks;
    }
    public int getmarksObtain(){
        return marksObtain;
    }
}
class SubjectTest{
    public static void main(String[] args) {
        Subject subs[]=new Subject[5];
        subs[0]=new Subject("2-Ai","Ds",100,43);
        subs[1]=new Subject("3-ak","Algo",100,45);
        subs[2]=new Subject("4-hf","OS",100,78);

        for(Subject s:subs){
            System.out.println(s.getsubId());
            System.out.println(s.getsubName());
            System.out.println(s.getmaxMarks());
            System.out.println(s.getmarksObtain());
        }
    }
}