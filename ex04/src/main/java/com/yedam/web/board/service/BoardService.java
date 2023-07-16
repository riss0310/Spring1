package com.yedam.web.board.service;

import java.util.List;
import java.util.Map;

public interface BoardService {
	// 전체조회
	public List<BoardVO> selectBoardAllList();

	// 단건조회
	public BoardVO selectBoardInfo(BoardVO boardVO);

	// 등록
	public int insertBoardInfo(BoardVO boardVO);

	// 수정
	public Map<String, String> updateBoardInfo(BoardVO boardVO);

	// 삭제
	public Map<String, String> deleteBoardInfo(int bNo);
}
