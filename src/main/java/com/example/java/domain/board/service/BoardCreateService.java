package com.example.java.domain.board.service;

import com.example.java.domain.board.domain.Board;
import com.example.java.domain.board.domain.repository.BoardRepository;
import com.example.java.domain.board.presentation.dto.BoardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BoardCreateService {
    private BoardRepository boardRepository;


    public void createBoard(BoardRequest boardRequest){
        boardRepository.save(
                Board.builder()
                        .name(boardRequest.getName())
                        .title(boardRequest.getTitle())
                        .content(boardRequest.getContent())
                        .now(LocalDateTime.now())
                        .build()
        );
    }
}
