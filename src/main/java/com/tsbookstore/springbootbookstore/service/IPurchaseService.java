package com.tsbookstore.springbootbookstore.service;

import com.tsbookstore.springbootbookstore.model.PurchaseHistory;
import com.tsbookstore.springbootbookstore.repository.projections.IPurchaseItem;

import java.util.List;

public interface IPurchaseService {
    PurchaseHistory savePurchase(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
