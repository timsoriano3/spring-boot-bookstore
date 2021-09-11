package com.tsbookstore.springbootbookstore.service;

import com.tsbookstore.springbootbookstore.model.PurchaseHistory;
import com.tsbookstore.springbootbookstore.repository.IPurchaseRepository;
import com.tsbookstore.springbootbookstore.repository.projections.IPurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseService implements IPurchaseService{
    private final IPurchaseRepository purchaseRepository;

    public PurchaseService(IPurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public PurchaseHistory savePurchase(PurchaseHistory purchaseHistory) {
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchaseHistory);
    }

    @Override
    public List<IPurchaseItem> findPurchasedItemsOfUser(Long userId) {
        return purchaseRepository.findAllPurchaseOfUser(userId);
    }
}
