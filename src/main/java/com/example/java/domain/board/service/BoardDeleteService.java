package com.example.java.domain.board.service;

import com.example.java.domain.board.domain.Board;
import com.example.java.domain.board.domain.repository.BoardRepository;
import org.springframework.stereotype.Service;

@Service
public class BoardDeleteService {
    private BoardRepository boardRepository;

    public void deleteBoard(Long id){
        Board board = boardRepository.findById(id).orElseThrow(() -> new RuntimeException(""));
        boardRepository.delete(board);
    }
}
