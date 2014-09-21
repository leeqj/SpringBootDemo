package com.leeqj.server.beans;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/**
 * Created by leeqj on 14-9-21.
 */
public class PageAble implements Pageable {
    @Override
    public int getPageNumber() {
        return 0;
    }

    @Override
    public int getPageSize() {
        return 0;
    }

    @Override
    public int getOffset() {
        return 0;
    }

    @Override
    public Sort getSort() {
        return new Sort(new Sort.Order(Sort.Direction.DESC, "id"));
    }

    @Override
    public Pageable next() {
        Pageable page = new PageAble();
//        page.
        return null;
    }

    @Override
    public Pageable previousOrFirst() {
        return null;
    }

    @Override
    public Pageable first() {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }
}
