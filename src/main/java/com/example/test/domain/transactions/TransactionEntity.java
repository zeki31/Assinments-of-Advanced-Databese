package com.example.test.domain.transactions;

import lombok.AllArgsConstructor;
import lombok.Data;

//クラスの全てのフィールドを引数にとる。
@AllArgsConstructor
@Data
public class TransactionEntity {
    private long id;
    private String title;
    private String impressions;
}