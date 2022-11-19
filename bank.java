package bank;

public interface bank {
    final int size = 10;

    public  String createAcc(int accno,String name, float amount);
    public String withdrawAmm(int accno, float amount);
    public String depositeAmm(int accno,float amount);
    public String checkBal(int accno);


}
