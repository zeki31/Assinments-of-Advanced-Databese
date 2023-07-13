package com.example.test.domain.transactions;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public List<TransactionEntity> findAll(){
        return List.of(
                new TransactionEntity(1,"Angular フォームボタンの無効について","very good"),
                new TransactionEntity(2,"Wingetで簡単！開発PCセットアップ（Windows）","very good"),
                new TransactionEntity(3,"DirectMLで試す、非NVIDIA系GPUで機械学習","very good"),
                new TransactionEntity(4,"Wingetで簡単！開発PCセットアップ（Windows）","very good"),
                new TransactionEntity(5,"DirectMLでStable Diffusionを動かしてみる","very good"),
                new TransactionEntity(6,"Googleカレンダーの当日予定をSlackに通知する","very good"),
                new TransactionEntity(7,"[AWS]SAMでTypeScriptがサポートされたので5分でAPIを作成する","very good")
        );
    }
}