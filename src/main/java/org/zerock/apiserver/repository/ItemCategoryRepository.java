package org.zerock.apiserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.apiserver.domain.ItemCategory;

public interface ItemCategoryRepository extends JpaRepository<ItemCategory, Long> {
}