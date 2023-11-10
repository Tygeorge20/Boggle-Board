# script game.py
"""Implements the logic of the game of boggle."""

# import all relevant packages and classes
from graphics import *
from random import randint
from boggleboard import BoggleBoard
from boggleletter import BoggleLetter
from bogglewords import BoggleWords

# This helper function creates the Boggle lexicon.
def lexicon(filename='bogwords.txt'):
    """Reads words (one per line) from filename (by default 'bogwords.txt')
    and returns a set of all words"""
    result = set()
    with open(filename) as f:
        for lines in f:
            result.add(lines.strip())
    return result

def setup(win, board):
    """Given a graphical window and BoggleBoard board,
    sets up the game board by resetting the letters on it
    and drawing the board with letters"""
    pass

def resetLower(board):
    """Given a BoggleBoard board, clears the letters on the board,
    along with the lower text area"""
    pass

def update(board, bWords):
    """Updates the state of the BoggleBoard board after a valid word has been found
    and added to BoggleWords bWords; updates right text area, clears lower
    text area, and resets BoggleLetters to unclicked state."""
    pass

def play(win, board):
    """Given a graphical window and a BoggleBoard board, implements the logic
    for playing the game"""

    # initialize flag and boggle words
    exitFlag = False

    # populate the lexicon
    validWords = lexicon()

    # initialize an empty BoggleWords object
    bWords = BoggleWords()

    while not exitFlag:

        # first find (col, row) coord of mouse click
        point = win.getMouse()

        # step 1: check for exit button and exit

        # step 2: check for reset button and reset

        # step 3: check if click is on a cell in the grid

            # get BoggleLetter at that position

            # if starting a new word, add letter and display it on lower text of board

            # if adding letter to existing word, check for adjacency, update state

            # if clicked on same letter as last time, end word, check for validity
            # if word is valid update bWords

            # if clicked on some other letter, cancel word, reset state



if __name__ == '__main__':
    pass
    #win = GraphWin("Boggle", 400, 400)
    #board = BoggleBoard()
    #setup(win, board)
    #play(win, board)
