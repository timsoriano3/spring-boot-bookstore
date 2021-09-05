package com.tsbookstore.springbootbookstore.repository;

import com.tsbookstore.springbootbookstore.model.PurchaseHistory;
import com.tsbookstore.springbootbookstore.repository.projections.IPurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPurchaseRepository extends JpaRepository<PurchaseHistory, Long> {
    @Query("select " +
            "b.title as title, ph.price as price, ph.purchaseTime as purchaseTime " +
            "from PurchaseHistory ph left join Book b on b.id = ph.bookId " +
            "where ph.userId = :userId")
    List<IPurchaseItem> findAllPurchaseOfUser(@Param("userId") Long userId);
}
