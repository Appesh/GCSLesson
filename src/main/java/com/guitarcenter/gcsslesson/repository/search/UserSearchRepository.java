package com.guitarcenter.gcsslesson.repository.search;

import com.guitarcenter.gcsslesson.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {}
