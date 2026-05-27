package com.org.structure.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChessPiece {

    private ChessUnit chessUnit;

    private Position position;


}
