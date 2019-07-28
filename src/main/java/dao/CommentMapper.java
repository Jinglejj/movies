package dao;

import java.util.List;
import pojo.Comment;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer comId);

    int insert(Comment record);

    Comment selectByPrimaryKey(Integer comId);

    List<Comment> selectAll();

    int updateByPrimaryKey(Comment record);
}