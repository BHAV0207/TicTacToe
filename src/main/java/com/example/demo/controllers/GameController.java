package com.example.demo.controllers;

import java.util.List;

import com.example.demo.Models.Game;
import com.example.demo.Models.GameState;
import com.example.demo.Models.Player;
import com.example.demo.exceptions.InvalidMoveException;

public class GameController
{
    public Game startGame(int dimension, List<Player> players)
    {
        return new Game(dimension, players);
    }
    public void makeMove(Game game) throws InvalidMoveException
    {
        game.makeMove();
    }
    public GameState checkState(Game game)
    {
        return game.getGameState();
    }
    public Player getWinner(Game game)
    {
        return game.getWinner();
    }
    public void printBoard(Game game)
    {
        game.printBoard();
    }
}

