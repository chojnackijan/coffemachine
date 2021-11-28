package LearnJavaBasic;

public class Monitor {
    public String Resolution;
    int width = 3820;
    int high = 1800;

    public void setHighResolution() {
        width = 3820;
        high = 1800;
    }

    public void setLowResolution() {
        width = 900;
        high = 600;
    }

    public String getResolution(){
        return width + "x" + high ;
    }


}



