package com.example.service;

import com.example.pojo.Comment;
import com.example.pojo.Passage;

import java.util.List;

public interface CommentSevice {
    //查询所有评论
    List<Comment> selectAllComments();
    //根据username查询评论
    List<Comment> selectAllCommentsOfOneUser(String userName);
    //增加一条评论
    int addComment(Comment comment);
    //删除评论
    int deleteComment(String cmID);
    //编辑评论内容
    int updateComment(Comment comment);
    //查询用户评论的文章
    List<Passage> selectAllPassagesOfOneUser(String userName);
    //查询一篇文章所有评论
    List<Comment> selectAllCommentsOfOnePassage(String postID);
}
