package main.java.com.bilalkose.cleancode.ch3_functions.c04.solution;

import main.java.com.bilalkose.cleancode.ch3_functions.c04.Money;

public abstract class Employee {
    public abstract boolean isPayday(); //Maaş günü mü
    public abstract Money calculatePay();
    public abstract void deliverPay(Money pay);

    //Pay terminolojisi seçildiği için hep buradan gidilmiş.
    //Örneğin calculatePay yerine calculateMoney denmemiş.

    //* İsim vermek için zaman harcamaktan korkulmamalı.
}
