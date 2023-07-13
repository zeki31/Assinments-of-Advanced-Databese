package com.example.test.domain.removes;

import lombok.AllArgsConstructor;
import lombok.Data;

//クラスの全てのフィールドを引数にとる。
@AllArgsConstructor
@Data
public class RemoveEntity {
    private long id;
    private String title;
    private String impressions;
}
