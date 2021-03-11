package com.bigdata.maven;

public class FamilyAccount {
    public static void main(String[] args){

        int balance = 10000;
        boolean isFalg = true;
        String details = "收支\t  账户金额\t  收支金额  \t     说   明\n";
        while(isFalg){

            System.out.println("-----------家庭收支记账软件-------------");
            System.out.println("         1.收支明细");
            System.out.println("         2.登记收入");
            System.out.println("         3.登记支出");
            System.out.println("         4.退出 \n");
            System.out.println("         请选择(1-4)：");

            char selection = Utility.readMenuSelection();
            System.out.println();
            switch(selection){
                case '1':
                    System.out.println("\n---------------当前收支明细记录-----------\n");
                    System.out.println(details);
                    System.out.println("\n-------------------------------------\n");
                    break;
                case '2':
                    System.out.println("2.登记收入");
                    System.out.println("本次收入金额：");
                    int money = Utility.readNumber();
                    balance +=money;
                    System.out.println("本次收入说明：");
                    String info = Utility.readString();
                    details += "收入\t" + balance + "\t\t" + money + "\t\t"+info+"\n";
                    System.out.println("---------完成收入登记--------");
                    break;
                case '3':
                    System.out.println("3.登记支出");
                    System.out.println("本次支出金额：");
                    int money1 = Utility.readNumber();
                    if(balance >=money1 ){
                        balance -=  money1;
                    }else{
                        System.out.println("支出超出账户额度，支付失败");
                    }

                    System.out.println("本次支出说明：");
                    String info1 = Utility.readString();
                    details += "支出\t"+balance+"\t"+money1+"\t"+info1+"\n";
                    break;
                case '4':
                    System.out.println("4.退出");
                    System.out.println("是否确认退出(Y/N)：");
                    char isExit = Utility.readConfirmSelection();
                    if(isExit == 'Y' ){
                        isFalg = false;
                    }
                    break;
            }
            //isFalg = false;
        }
    }
}
