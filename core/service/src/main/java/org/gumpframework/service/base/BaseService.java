package org.gumpframework.service.base;


import org.gumpframework.domain.base.BaseEntity;


public interface BaseService<T extends BaseEntity> {
    T save(T entity);
}
