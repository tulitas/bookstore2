package com.repositories;


import com.entities.JobForm;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


@Repository
public interface JobformRepository extends CrudRepository<JobForm, Long> {



    @Query(value = "select  id, bookauthor, booktitle, bookname, bookgenre," +
            " bookpages, bookprice from bookstore order by id desc ", nativeQuery = true)
    List<JobForm> getAllById();



    @Query(value = "SELECT count(work) FROM jobform where work = 'Montaz'", nativeQuery = true)
    String getStatistics();

}