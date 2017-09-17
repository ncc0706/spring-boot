package io.arukas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by niuyuxian on 17/09/2017.
 */
@NoRepositoryBean
public interface BaseRepository<T> extends JpaRepository<T, Long> {
}
