package com.tsbookstore.springbootbookstore.controller;

import com.tsbookstore.springbootbookstore.model.PurchaseHistory;
import com.tsbookstore.springbootbookstore.security.UserPrincipal;
import com.tsbookstore.springbootbookstore.service.IPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase-history") //pre path
public class PurchaseController {
    @Autowired
    private IPurchaseService purchaseService;

    @PostMapping //api/purchase-history
    public ResponseEntity<?> savePurchase(@RequestBody PurchaseHistory purchase) {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping //api/purchase-history
    public ResponseEntity<?> findPurchasedItemsOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return ResponseEntity.ok(purchaseService.findPurchasedItemsOfUser(UserPrincipal.createSuperUser().getId()));
    }
}
