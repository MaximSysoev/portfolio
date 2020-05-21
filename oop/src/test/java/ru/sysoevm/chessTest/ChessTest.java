package ru.sysoevm.chessTest;

import org.junit.Test;
import ru.sysoevm.chess.Board;
import ru.sysoevm.chess.Cell;
import ru.sysoevm.chess.Horse;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ChessTest {
    /**
     * проверяет, может ли пойти фигура Конь с координатами (x=, y=0) сделать ход (x=2, y=2)
     */
    @Test
    public void WhenHourseWalksInCellOneThree() {
        Horse horse = new Horse( new Cell(1, 0) ); // Создан экземпляр объекта класса Horse;
        Board figureHorse = new Board(horse);
        figureHorse.cell[horse.position.getX()][horse.position.getY()] = horse;
        boolean result = figureHorse.move(new Cell(1, 0), new Cell(2, 2));
        assertThat(result, is(true));
    }
}
