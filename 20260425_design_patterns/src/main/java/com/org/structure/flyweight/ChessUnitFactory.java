package com.org.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessUnitFactory {

    private static Map<Long, ChessUnit> chessUnitMap = new HashMap<>(64);

    static {
        chessUnitMap.put(1L, new ChessUnit(1L, "兵", ChessUnit.Color.RED));
        chessUnitMap.put(2L, new ChessUnit(2L, "马", ChessUnit.Color.RED));
        chessUnitMap.put(3L, new ChessUnit(3L, "炮", ChessUnit.Color.RED));
        chessUnitMap.put(4L, new ChessUnit(4L, "将", ChessUnit.Color.RED));
        chessUnitMap.put(5L, new ChessUnit(4L, "相", ChessUnit.Color.BLACK));
    }

    // 暴露一个工厂方法 用来获取棋子
    public static ChessUnit getChessUnit(Long id) {
        return chessUnitMap.get(id);
    }

}
