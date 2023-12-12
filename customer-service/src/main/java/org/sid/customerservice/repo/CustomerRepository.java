package org.sid.customerservice.repo;

import org.sid.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource // generer automatiquement l API restful pour gerer customer
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
