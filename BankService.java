package bank;

public class BankService implements bank{

    int []accno = new int[size];
    String []name = new String[size];
    float amount[] = new float[size];
static int count = 0;
static int flag=  0;
   static String  temp = null;
    public String createAcc(int accno,String name, float amount) {

       for (int i = 0;i<this.accno.length;i++){
          if (accno==this.accno[i]){
             // temp = "this "+Integer.toString(accno)+"accno is already existed";
              return "this account is already existed";
          } else if (this.accno[i]==0) {
              this.accno[i]=accno;
              this.name[i]=name;

              if (amount<500){
                  //temp = "your amount is: "+amount+" please enter amount greaterv then 500";
                  return "enter amount greater then 500";

              }else {
                  this.amount[i] = amount;
              }
              count++;
              if (count==1)
                  System.out.println(count+" acount is created");
              else System.out.println(count+" acounts created");
              break;
          }
       }
            return "*accno is: "+ accno+" *name is: "+ name +" *amount is: "+amount;
        }



    public String withdrawAmm(int accno, float amount) {

        for (int i = 0; i < this.accno.length; i++) {

            if (this.accno[i] ==accno){
                float ans = this.amount[i]-amount;
                if (ans>500){
                    this.amount[i]=this.amount[i]-amount;
                    return "withdraw successful..." ;
                }
                else {
                    return "min balance is 500 you cant withdraw";

                }
            }else {
                return "Account not exist";
            }

        }
        return "*accno is"+ accno+"*amount is: "+ amount;
    }
    public String depositeAmm(int accno,float amount){

        for (int i = 0;i<this.accno.length;i++)
        if (this.accno[i] ==accno){

            if (amount<50000){
                this.amount[i]=this.amount[i]+amount;
                return "Deposite successful..." ;
            }
            else {
                return "maximun deposite is 50000";

            }
        }else {
            return "Account not exist";
        }

        return "*accno is"+ accno+"*amount is: "+ amount;

    }
    public String checkBal(int accno) {

        for (int i = 0; i < this.accno.length; i++) {

            if (this.accno[i] == accno) {
                return Float.toString(amount[i]);
            }else {}
            return "account is not exist";
        }
        return "thank you";
    }

}
