package Game;

import People.Person;
import Rooms.Room;
import Rooms.WinningRoom;


public class Board
{
    Room[] [] map;

    public Board(Room[][] map)
    {
        this.map = map;

    }
    public Board(int height, int width)
    {
        map = new Room[height][width];
    }
}
