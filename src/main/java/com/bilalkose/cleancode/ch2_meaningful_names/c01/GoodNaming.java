package main.java.com.bilalkose.cleancode.ch2_meaningful_names.c01;

import java.util.ArrayList;
import java.util.List;

public class GoodNaming {
    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays; //doğru isimlendirmeler

    public List<Cell> getFlaggedCells(Cell[] gameBoard){ //işaretli cell'leri getir.
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBoard)
            if(cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }
}
