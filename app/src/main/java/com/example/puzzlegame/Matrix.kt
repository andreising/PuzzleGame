package com.example.puzzlegame

class Matrix (val height: Int, val width: Int) {
    val listOfCells =  mutableListOf<Cell>()

    init {
        for (i in 1..height) {
            for (j in 1..width) {
                listOfCells.add(Cell(j,i))
            }
        }
    }


}