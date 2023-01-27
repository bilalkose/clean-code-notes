package main.java.com.bilalkose.cleancode.ch2_meaningful_names.c05;

public class IyiOrnek {

    private String description;

    void setDescription(String description) {
        this.description = description;
    }

    // değişken isminin metottaki argümanın ismiyle aynı olması daha mantıklı olacaktır


    {
        int realDaysPerIdealDay = 4;
        int WORK_DAYS_PER_WEEK = 5;
        int NUMBER_OF_TASKS = 2;
        int [] taskEstimate = new int[4];
        int realdays = 10;
        //arandığında bulunacak tarzda isimlendirmeler

        int sum = 0;
        for (int j=0; j < NUMBER_OF_TASKS; j++) {
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }
    }

}


