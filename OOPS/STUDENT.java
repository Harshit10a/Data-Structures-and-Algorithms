public class STUDENT {
    String name ;
     int Roll;
    Double percent;

    public int getRoll(){          //Getter function
        return Roll;
    }
    public void setRoll(int y){      //Setter function
        Roll=y;
    }

    public STUDENT(String naam,int rno,Double per){ //Constructor
        name =naam;
        Roll =rno;
        percent =per;
    }

}
