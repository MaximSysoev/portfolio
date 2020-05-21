package ru.sysoevm.chess;

public abstract class Figure {

    public final Cell position;

    public Figure(Cell position) {
        this.position = position;
    }

    /**
     * Делает ход.
     * @param dist - задаёт ячейку куда следует пойти.
     * @return массив с ячейками.
     */
    abstract Cell[] way(Cell dist) throws ImposibleMoveException;
    abstract Figure clone(Cell dist);
}
