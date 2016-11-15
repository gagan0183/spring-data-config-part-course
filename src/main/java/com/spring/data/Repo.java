package com.spring.data;

import java.io.Serializable;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface Repo<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID> {
	<S extends T> S save(S entity);

	T findOne(ID id);
}
