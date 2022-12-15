package com.example.puzzlegame

class Game(val difficulty: Int) {
    private val maxNumber: Int
        get() {
            return when(difficulty) {
                in 1..2 -> 4
                in 3..10 -> 5
                else -> 6
            }
        }
    private val listOfNumbers = mutableListOf<Int>()
    private val mainMatrix: Matrix
        get() {
            return when(difficulty) {
                in 1..2 -> Matrix(2,2)
                in 3..10 -> Matrix(3,3)
                else -> Matrix(4,4)
            }
        }
    private val listOfCells = mutableListOf<Cell>()
    var count = 1

    fun generateCell(): Cell {
        val cell = Cell((1..mainMatrix.width).random(),(1..mainMatrix.height).random())
        listOfCells.add(cell)
        if (count>difficulty) listOfCells.removeFirst()
        return cell
    }
    fun generateNumber(): Int {
        val number = (1..maxNumber).random()
        listOfNumbers.add(number)
        if (count>difficulty) listOfNumbers.removeFirst()
        return number
    }
    fun checkCell(cell: Cell): Boolean = cell==listOfCells[0]
    fun checkNumber(number: Int): Boolean = number==listOfNumbers[0]




}