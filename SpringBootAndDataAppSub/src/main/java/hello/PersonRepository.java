package hello;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by kdo on 2015-11-30.
 * 사람 레파지토리
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
    /**
     * 이름으로 사람 찾기
     *
     * @param name 이름
     * @return
     */
    List<Person> findByLastName(@Param("name") String name);
}