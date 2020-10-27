package com.jxd.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.emp.model.Book;

import java.util.List;

public interface IBookMapper extends BaseMapper<Book> {

    List<Book> selectBookWithPublic();
}
