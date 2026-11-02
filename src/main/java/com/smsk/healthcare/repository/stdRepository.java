
package com.smsk.healthcare.repository;

import com.smsk.healthcare.entity.std;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

public interface stdRepository extends JpaRepository<std,Long> {
}