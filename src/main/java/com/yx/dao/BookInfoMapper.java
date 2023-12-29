package com.yx.dao;

import com.yx.po.BookInfo;

import java.util.List;

public interface BookInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    int insert(BookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    int insertSelective(BookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    BookInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    int updateByPrimaryKeySelective(BookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    int updateByPrimaryKey(BookInfo record);

    /**
     * 查询所有图书记录
     */
    List<BookInfo> queryBookInfoAll(BookInfo bookInfo);

    /**
     * 根据类型获取图书数量
     */
    List<BookInfo> getBookCountByType();
}