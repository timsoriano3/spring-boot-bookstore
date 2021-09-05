package com.tsbookstore.springbootbookstore.repository.projections;

import java.time.LocalDateTime;

public interface IPurchaseItem {
    String getTitle();
    Double getPrice();
    LocalDateTime getPurchaseDate();
}
