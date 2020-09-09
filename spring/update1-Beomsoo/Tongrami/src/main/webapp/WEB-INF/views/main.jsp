<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Tongrami</title>
	<link rel="stylesheet" href="css/navi.css">
    <link rel="stylesheet" href="css/main.css">
</head>
<body>
	<div class="GNB">
        <a href="#"><img class="logo" src="image/logo_Tongrami.png" alt="Tongrami 로고"></a>
        <ul id="navi-container">
            <li><input type="text" class="search" placeholder="검색"></li>
            <li>
                <ul id="navi">
                    <li>홈</li>
                    <li>좋</li>
                    <li>메</li>
                    <li>프</li>
                </ul>
            </li>
        </ul>
        <hr>
    </div>
    <div class="board-container">
        <h3>업로드한 사람</h3>
        <div class="board-image-container">
            <img src="image/Test.jpg" style="width: 700px; height: 700px;">
        </div>
        <div class="board-navi">
            <ul>
                <li>좋</li>
                <li>댓</li>
                <li>메</li>
            </ul>
            <p>좋아요 ㅁㅁ개</p>
        </div>
        <div class="content-container">
            <p>오늘 이거 그려봤음</p><br>
        </div>
        <hr>
        <div class="comment-container">
            <p class="comment">댓글</p><input class="comment-button" type="button" value="게시">
        </div>
    </div>
    <div class="others-container">
        <div class="my-container">
            내프로필 아이콘ㅁ
        </div>
        <div class="recommend-container">
            <p class="today-follow">오늘의 팔로우</p><a href="#" class="today-follow" id="more"><p>모두 보기</p></a>
            <p>친구1</p>
            <p>친구2</p>
            <p>친구3</p>
            <p>친구4</p>
            <p>친구5</p>
        </div>
        <div class="sitemap-container">
            <a href="#"><p>소개</p></a><a href="#"><p>도움말</p></a><a href="#"><p>인기계정</p></a>
            COPYRIGHT 어쩌고
        </div>
    </div>
</body>
</html>