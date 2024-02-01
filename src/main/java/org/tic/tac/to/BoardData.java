package org.tic.tac.to;

import lombok.Data;

@Data
public class BoardData {
    private CellStateEnum cellState;
    private PlayerEnum player;
}
